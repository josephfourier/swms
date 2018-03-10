package com.thinkjoy.swms.config;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.thinkjoy.common.db.DynamicDataSource;
import com.thinkjoy.common.listener.ApplicationContextListener;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by wangcheng on 18/2/8.
 */
@EnableTransactionManagement
@Configuration
@Import(DruidDataSourceConfig.class)
public class MybatisConfig {

    private static final Log log = LogFactory.getLog(MybatisConfig.class);

    /**
     * 配置 SqlSessionFactoryBean
     *
     * @return the sql session factory bean
     * @ConfigurationProperties 在这里是为了将 MyBatis 的 mapper 位置和持久层接口的别名设置到
     * Bean 的属性中，如果没有使用 *.xml 则可以不用该配置，否则将会产生 invalid bond statement 异常
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(
            @Qualifier(value = "dynamicDataSource") DynamicDataSource dataSource

    ) throws Exception {
        String mapperLocations = "classpath*:com/thinkjoy/**/rpc/mapper/*Mapper.xml";
        String configLocation = "classpath:mybatis-config.xml";
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource); //数据源
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            //自动扫描Mapping.xml文件
            sqlSessionFactory.setMapperLocations(resolver.getResources(mapperLocations));
            sqlSessionFactory.setConfigLocation(resolver.getResource(configLocation));
            return sqlSessionFactory.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    //    MyBatis 动态扫描
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        log.info("初始化MapperScannerConfigurer");
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        String basePackage = "com.thinkjoy.**.dao.mapper";
        mapperScannerConfigurer.setBasePackage(basePackage);
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }

    @Bean
    public ApplicationContextListener applicationContextListener(){
        return new ApplicationContextListener();
    }
}

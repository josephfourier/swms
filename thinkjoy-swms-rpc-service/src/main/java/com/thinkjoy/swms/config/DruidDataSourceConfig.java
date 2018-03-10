package com.thinkjoy.swms.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.thinkjoy.common.db.DataSourceEnum;
import com.thinkjoy.common.db.DynamicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangcheng
 * @date 18/2/8
 */
@Configuration
public class DruidDataSourceConfig {

    private static final Log log = LogFactory.getLog(DruidDataSourceConfig.class);


    @Value("${master.jdbc.driver}")
    private String mdriver;
    @Value("${master.jdbc.url}")
    private String mconnectionUrl;
    @Value("${master.jdbc.username}")
    private String musername;
    @Value("${master.jdbc.password}")
    private String mpassword;


    @Value("${slave.jdbc.driver}")
    private String sdriver;
    @Value("${slave.jdbc.url}")
    private String sconnectionUrl;
    @Value("${slave.jdbc.username}")
    private String susername;
    @Value("${slave.jdbc.password}")
    private String spassword;

    //配置主数据源
    @Bean(name = "masterDataSource", initMethod = "init", destroyMethod = "close")
    public DruidDataSource masterDataSource() {
        log.info("初始化DruidDataSource");
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(mdriver);
        dds.setUrl(mconnectionUrl);
        dds.setUsername(musername);
        dds.setPassword(mpassword);
        setProperty(dds);
        try {
            dds.setFilters("stat");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dds;
    }


    //配置从数据源
    @Bean(name = "slaveDataSource", initMethod = "init", destroyMethod = "close")
    public DruidDataSource slaveDataSource() {
        log.info("初始化DruidDataSource");
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(sdriver);
        dds.setUrl(sconnectionUrl);
        dds.setUsername(susername);
        dds.setPassword(spassword);
        setProperty(dds);
        try {
            dds.setFilters("stat");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dds;
    }

    public DruidDataSource setProperty(DruidDataSource dds) {
        dds.setInitialSize(1);
        dds.setMinIdle(1);
        dds.setMaxActive(20);
        dds.setMaxWait(60000);
        dds.setTimeBetweenEvictionRunsMillis(60000);
        dds.setMinEvictableIdleTimeMillis(300000);
        dds.setValidationQuery("SELECT 1");
        dds.setTestWhileIdle(true);
        dds.setTestOnBorrow(false);
        dds.setTestOnReturn(false);
        return dds;
    }


    /**
     * Dynamic data source.
     * 动态数据源
     *
     * @return the data source
     */
    @Bean("dynamicDataSource")
    @Primary
    public DynamicDataSource dynamicDataSource() {
        DynamicDataSource dynamicRoutingDataSource = new DynamicDataSource();
        Map<Object, Object> dataSourceMap = new HashMap<>(4);
        dataSourceMap.put(DataSourceEnum.MASTER.name(), masterDataSource());
        dataSourceMap.put(DataSourceEnum.SLAVE.name(), slaveDataSource());
        // 将 master 数据源作为默认指定的数据源
        dynamicRoutingDataSource.setDefaultTargetDataSource(masterDataSource());
        // 将 master 和 slave 数据源作为指定的数据源
        dynamicRoutingDataSource.setTargetDataSources(dataSourceMap);
        return dynamicRoutingDataSource;
    }

    //配置事务管理
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier(value = "dynamicDataSource") DataSource dataSource) {
        log.info("初始化DataSourceTransactionManager");
        return new DataSourceTransactionManager(dataSource);
    }

//    @Bean
//    public ServletRegistrationBean druidServlet() {
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
//        //设置登录查看信息的账号密码.
//        servletRegistrationBean.addInitParameter("loginUsername", "admin");
//        servletRegistrationBean.addInitParameter("loginPassword", "9527");
//        return servletRegistrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        return filterRegistrationBean;
//    }


}

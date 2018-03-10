package com.thinkjoy.swms.common.config;

import com.thinkjoy.zkconfig.sz.ZookeeperConfigurer;
import com.thinkjoy.zkconfig.sz.ZookeeperResource;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangcheng on 18/2/7.
 */
@Configuration
public class ZkConfig {

    @Bean
    public PropertyPlaceholderConfigurer getPPC() {
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
        propertyPlaceholderConfigurer.setOrder(1);
        propertyPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        return propertyPlaceholderConfigurer;
    }

    @Bean
    public ZookeeperResource getZkResource() {
        return new ZookeeperResource();
    }

    @Bean
    public ZookeeperConfigurer getZkConfigurer() {
        ZookeeperConfigurer zookeeperConfigurer = new ZookeeperConfigurer();
        zookeeperConfigurer.setOrder(1);
        zookeeperConfigurer.setIgnoreUnresolvablePlaceholders(true);
        zookeeperConfigurer.setLocation(getZkResource());
        return zookeeperConfigurer;
    }
}

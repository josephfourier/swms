package com.thinkjoy.swms.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by wangcheng on 18/2/7.
 */
@Configuration
@ImportResource("classpath:dubbo-provider.xml")
public class DubboProviderConfig {

}

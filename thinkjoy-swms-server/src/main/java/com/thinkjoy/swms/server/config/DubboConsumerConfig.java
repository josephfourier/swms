package com.thinkjoy.swms.server.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by wangcheng on 18/2/7.
 */
@Configuration
@ImportResource("classpath:dubbo-consumer.xml")
public class DubboConsumerConfig {

}

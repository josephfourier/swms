package com.thinkjoy.swms;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.reger.dubbo.rpc.filter.Utils;
import com.thinkjoy.swms.common.exception.DemoException;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.concurrent.CountDownLatch;

@DubboComponentScan("com.thinkjoy.swms")
@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
public class DubboProviderApplication implements CommandLineRunner, DisposableBean {

    private final Logger log = LoggerFactory.getLogger(DubboProviderApplication.class);

    private final static CountDownLatch latch = new CountDownLatch(1);
    private static ConfigurableApplicationContext context;

    public static void main(String[] args) throws InterruptedException {
        //registerException();
        context = SpringApplication.run(DubboProviderApplication.class, args);
        latch.await();
    }

    /**
     * Dubbo的自定义异常处理
     * 如果自定义异常和Dubbo接口在同一个包中,则直接抛出
     * jdk和Dubbo自带的异常也直接抛出
     * 其他地方的异常,则直接封装成一个RuntimeException抛出
     * 该方法使用场景:如果想要抛出自定义异常,需要与接口同包
     * 否则,需要在该方法中注册自定义异常,并启用方法
     */
    public static void registerException() {
        Utils.register(DemoException.class);
    }

    @Override
    public void destroy() throws Exception {
        latch.countDown();
        context.close();
        log.info("服务提供者关闭------>>服务关闭");
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("服务提供者启动完毕------>>启动完毕");
    }
}

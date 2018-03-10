package com.thinkjoy.swms.server.config;

import com.thinkjoy.swms.server.interceptor.TokenInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;
import java.util.List;

/**
 * 跨域/中文乱码问题解决
 *
 * @author ckzhang
 * @date 2017/11/22
 */
@Configuration
public class CustomMVCConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public HandlerInterceptor handlerInterceptor(){
        return new TokenInterceptor();
    }

    //增加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(handlerInterceptor())
                .addPathPatterns("/manage/**");
    }

    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(
                Charset.forName("UTF-8"));
        return converter;
    }

    @Override
    public void configureMessageConverters(
            List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(responseBodyConverter());
    }

    @Override
    public void configureContentNegotiation(
            ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }




}

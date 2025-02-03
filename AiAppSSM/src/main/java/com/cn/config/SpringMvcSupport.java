package com.cn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.cn.interceptor.*;
// 定义一个配置类，用于定制Spring MVC的配置
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport{

    // 自动注入项目拦截器，用于后续配置拦截器
    @Autowired
    private ProjectInterceptor projectInterceptor;

    // 配置资源处理器，用于处理静态资源请求
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 配置/pages/**路径的资源处理器，指向/pages/目录
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        // 配置/css/**路径的资源处理器，指向/css/目录
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        // 配置/js/**路径的资源处理器，指向/js/目录
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        // 配置/plugins/**路径的资源处理器，指向/plugins/目录
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }

    // 配置拦截器，用于注册自定义的拦截器
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 注册项目拦截器，应用于/book路径
        registry.addInterceptor(projectInterceptor)
        .addPathPatterns("/*")
        .excludePathPatterns("/api/sign/**");
    }

}
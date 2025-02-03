package com.cn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Spring MVC配置类
 * 该类通过注解方式配置Spring MVC的相关设置
 * 同时指定Spring在启动时自动扫描的包路径，以寻找组件、服务和控制器等
 */
@Configuration
// 指定Spring在启动时扫描的包路径，包括控制器和配置相关的包
@ComponentScan({"com.cn.controller","com.cn.config","com.cn.interceptor","com.cn.exception"})
// 启用Spring MVC，配置Spring MVC的必要设置
@EnableWebMvc
public class SpringMvcConfig {

}
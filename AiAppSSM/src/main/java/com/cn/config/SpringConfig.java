package com.cn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring配置类，用于定义Spring应用上下文的配置
 * 该类集中处理了事务管理、组件扫描、属性文件加载以及整合其他配置类的功能
 */
@Configuration
// 启用Spring的事务管理功能
@EnableTransactionManagement
// 指定Spring在"com.cn.service"包下自动扫描并注册Bean
@ComponentScan({"com.cn.service","com.cn.utils"})
// 加载"jdbc.properties"文件中的属性，以便在配置中使用
@PropertySource({"classpath:jdbc.properties","classpath:jwt.properties"})
// 导入其他配置类，整合JDBC和MyBatis的配置
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}
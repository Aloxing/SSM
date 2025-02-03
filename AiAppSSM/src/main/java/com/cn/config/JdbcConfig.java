package com.cn.config;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

public class JdbcConfig {

    //注入数据源相关属性

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    

    /**
     * 创建并配置数据源
     * 
     * 使用 Druid 数据源作为数据库连接池
     * Druid 是一个高性能的数据库连接池，它能够提供强大的监控和扩展功能
     * 
     * @return 配置好的数据源实例
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }



    /**
     * 配置并创建一个PlatformTransactionManager实例
     * 该实例用于管理数据源的事务
     * 
     * @param dataSource 数据源对象，用于事务管理
     * @return PlatformTransactionManager实例，用于管理事务
     */
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        // 创建DataSourceTransactionManager实例并设置其数据源
        DataSourceTransactionManager ds = new DataSourceTransactionManager();
        ds.setDataSource(dataSource);
        // 返回配置好的DataSourceTransactionManager实例
        return ds;
    }


}

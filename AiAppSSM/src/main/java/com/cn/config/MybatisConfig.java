package com.cn.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

public class MybatisConfig {
    /**
     * 创建并配置SqlSessionFactoryBean实例
     * 
     * @param dataSource 数据源，用于数据库连接
     * @return 返回配置好的SqlSessionFactoryBean实例
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        // 创建SqlSessionFactoryBean对象
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        
        // 设置类型别名包，扫描该包下的所有Entity类，简化配置
        sqlSessionFactoryBean.setTypeAliasesPackage("com.cn.domain");
        
        // 设置数据源，为SqlSessionFactoryBean提供数据库连接
        sqlSessionFactoryBean.setDataSource(dataSource);
        
        // 返回配置好的SqlSessionFactoryBean对象
        return sqlSessionFactoryBean;
    }


    /**
     * 配置并创建一个MapperScannerConfigurer的Bean
     * 该Bean用于扫描指定包下的Mapper接口，并将它们自动注册为Spring的Bean
     * 
     * @return MapperScannerConfigurer对象，用于配置MyBatis的Mapper接口扫描
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        // 创建一个MapperScannerConfigurer对象
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // 设置需要扫描的Mapper接口所在的包路径
        mapperScannerConfigurer.setBasePackage("com.cn.dao");
        // 返回配置好的MapperScannerConfigurer对象
        return mapperScannerConfigurer;
    }
}

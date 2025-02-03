package com.cn.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
    /**
     * 获取根配置类数组
     * 
     * 该方法用于指定Spring应用上下文中的配置类
     * 它返回一个包含配置类的数组，这里指定的配置类将被用于整个应用的配置
     * 
     * @return Class<?>[] 包含应用根配置类的数组
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
    
    /**
     * 获取Servlet配置类数组
     * 
     * 该方法用于指定Spring MVC中的配置类
     * 它返回一个包含配置类的数组，这里指定的配置类将被用于Spring MVC的配置
     * 
     * @return Class<?>[] 包含Spring MVC配置类的数组
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    
    /**
     * 获取Servlet映射数组
     * 
     * 该方法用于指定Spring MVC的URL映射
     * 它返回一个包含映射路径的数组，确定了Spring MVC如何处理和转发请求
     * 
     * @return String[] 包含Spring MVC URL映射的数组
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

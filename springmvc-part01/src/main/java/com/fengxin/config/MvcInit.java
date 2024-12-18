package com.fengxin.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 **/
public class MvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 指定service / mapper层的配置类
     */
    @Override
    protected Class<?>[] getRootConfigClasses () {
        return new Class[0];
    }
    /**
     * 指定springmvc的配置类
     */
    @Override
    protected Class<?>[] getServletConfigClasses () {
        return new Class[]{MvcConfig.class};
    }
    /**
     * 设置dispatcherServlet的处理路径!
     * 一般情况下为 / 代表处理所有请求!
     */
    @Override
    protected String[] getServletMappings () {
        return new String[]{"/"};
    }
}

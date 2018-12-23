package com.nf.config.web;

import com.nf.config.spring.SpringConfig;
import com.nf.config.spring_mvc.SpringMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {  //父容器
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {  //子容器
        return new Class[]{SpringMvc.class};
    }

    @Override
    protected String[] getServletMappings() { //映射
        return new String[]{"/"};
    }
}

package com.nyzs.eduonline.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/6 8:37
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    ConfigInfo configInfo;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/filestore/**").addResourceLocations("file:" + configInfo.getDatasrcDir() + "/");

        System.out.println("filestore: " + "file:" +configInfo.getDatasrcDir());
    }
}

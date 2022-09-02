package com.nyzs.eduonline.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * @author ：RukiHuang
 * @description：文件上传配置类
 *                 配置MaxFileSize等属性
 * @date ：2022/9/2 9:45
 */
@Configuration
public class UploadConfig {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个数据大小
        factory.setMaxFileSize(DataSize.ofMegabytes(200));
        //总上传文件的大小
        factory.setMaxRequestSize(DataSize.ofGigabytes(1));
        return factory.createMultipartConfig();
    }
}

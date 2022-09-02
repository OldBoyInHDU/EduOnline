package com.nyzs.eduonline.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：RukiHuang
 * @description：文件上传
 *                  上传路径
 *                  文件格式
 * @date ：2022/9/2 10:05
 */
@Component
@ConfigurationProperties(prefix = "file.upload")
public class UploadProperties {
    private String path;
    private String allowType;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAllowType() {
        return allowType;
    }

    public void setAllowType(String allowType) {
        this.allowType = allowType;
    }
}

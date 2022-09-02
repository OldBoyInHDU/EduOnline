package com.nyzs.eduonline.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

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
    private List<String> allowTypeList;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<String> getAllowType() {
        return allowTypeList;
    }

    public void setAllowType(List<String> allowTypeList) {
        this.allowTypeList = allowTypeList;
    }
}

package com.nyzs.eduonline.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/6 8:48
 */
@Component
@ConfigurationProperties(prefix = "file.store")
public class ConfigInfo {
    private String datasrcDir;

    public String getDatasrcDir() {
        return datasrcDir;
    }

    public void setDatasrcDir(String datasrcDir) {
        this.datasrcDir = datasrcDir;
    }
}

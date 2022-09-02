package com.nyzs.eduonline.Utils;

/**
 * @author ：RukiHuang
 * @description：文件名替换工具 避免文件名重复
 * @date ：2022/9/2 10:09
 */
public class UploadUtils {
    public static String generateFileName(String oldName) {
        String suffix = oldName.substring(oldName.lastIndexOf("."));
        return IDUtils.generateUniqueId() + suffix;
    }
}

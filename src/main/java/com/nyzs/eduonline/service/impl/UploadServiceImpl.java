package com.nyzs.eduonline.service.impl;

import com.nyzs.eduonline.Utils.UploadUtils;
import com.nyzs.eduonline.config.UploadProperties;
import com.nyzs.eduonline.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author ：RukiHuang
 * @description：上传service
 * @date ：2022/9/2 10:16
 */
@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    UploadProperties uploadProperties;

    @Override
    public String uploadDoc(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());
        if(!uploadProperties.getAllowType().get(0).equals(file.getContentType())) {
            throw new IOException("文档上传类型错误");
        }
        String fileName = UploadUtils.generateFileName(file.getOriginalFilename());
        File newFile = new File(uploadProperties.getPath()+"/doc/" + fileName);
        newFile.setWritable(true);//设置执行权限
        newFile.setReadable(true);//设置读权限
        newFile.setExecutable(true);//设施写权限
        file.transferTo(newFile);
        System.out.println(newFile.getPath());
        return fileName;
    }

    @Override
    public String uploadSoc(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());
        if(!uploadProperties.getAllowType().get(0).equals(file.getContentType())) {
            throw new IOException("文档上传类型错误");
        }
        String fileName = UploadUtils.generateFileName(file.getOriginalFilename());
        File newFile = new File(uploadProperties.getPath()+"/soc/" + fileName);
        newFile.setWritable(true);//设置执行权限
        newFile.setReadable(true);//设置读权限
        newFile.setExecutable(true);//设施写权限
        file.transferTo(newFile);
        System.out.println(newFile.getPath());
        return fileName;
    }

    @Override
    public String uploadVideo(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());
        if(!uploadProperties.getAllowType().get(1).equals(file.getContentType())) {
            throw new IOException("视频上传类型错误");
        }
        String fileName = UploadUtils.generateFileName(file.getOriginalFilename());
        File newFile = new File(uploadProperties.getPath()+"/video/" + fileName);
        newFile.setWritable(true);//设置执行权限
        newFile.setReadable(true);//设置读权限
        newFile.setExecutable(true);//设施写权限

        file.transferTo(newFile);
        System.out.println(newFile.getPath());
        return fileName;
    }

    @Override
    public String uploadCourseware(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());
        if(!uploadProperties.getAllowType().get(0).equals(file.getContentType())) {
            throw new IOException("课件上传类型错误");
        }
        String fileName = UploadUtils.generateFileName(file.getOriginalFilename());
        File newFile = new File(uploadProperties.getPath()+"/courseware/" + fileName);
        newFile.setWritable(true);//设置执行权限
        newFile.setReadable(true);//设置读权限
        newFile.setExecutable(true);//设施写权限
        file.transferTo(newFile);
        System.out.println(newFile.getPath());
        return fileName;
    }
}

package com.nyzs.eduonline.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {
    String uploadDoc(MultipartFile file) throws IOException;

    String uploadSoc(MultipartFile file) throws IOException;

    String uploadVideo(MultipartFile file) throws IOException;

    String uploadCourseware(MultipartFile file) throws IOException;


}

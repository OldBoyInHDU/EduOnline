package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;
import com.nyzs.eduonline.bean.dto.File;

import java.util.List;

public interface CoursewareService {
    List<CoursewareInfoDto> getCoursewareBySeminarOrTitle(String seminar, String title) throws Exception;

    void addCoursewareInfo(String seminar, List<File> uploadList) throws Exception;

    void deleteCoursewareInfo(Integer id) throws Exception;
}

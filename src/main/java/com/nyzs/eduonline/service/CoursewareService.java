package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;

import java.util.List;

public interface CoursewareService {
    List<CoursewareInfoDto> getCoursewareByPosOrTitle(String pos, String title) throws Exception;

    void addCoursewareInfo(String serverFileName) throws Exception;

    void deleteCoursewareInfo(Integer id) throws Exception;
}

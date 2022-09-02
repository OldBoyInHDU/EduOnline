package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;

import java.util.List;

public interface CoursewareService {
    List<CoursewareInfoDto> getCoursewareByPosOrTitle(String pos, String title) throws Exception;
}

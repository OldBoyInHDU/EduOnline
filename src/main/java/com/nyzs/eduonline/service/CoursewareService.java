package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;

import java.util.List;

public interface CoursewareService {
    List<CoursewareInfoDto> getCoursewareByPosOrTitle(int page, int pageSize, String pos, String title) throws Exception;
}

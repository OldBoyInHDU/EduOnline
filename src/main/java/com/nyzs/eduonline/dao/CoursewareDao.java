package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoursewareDao {
    List<CoursewareInfoDto> getCoursewareBySeminarOrTitle(String seminar, String title) throws Exception;

    void addCoursewareInfo(CoursewareInfoDto coursewareInfoDto) throws Exception;

    void deleteCoursewareInfo(Integer id) throws Exception;
}

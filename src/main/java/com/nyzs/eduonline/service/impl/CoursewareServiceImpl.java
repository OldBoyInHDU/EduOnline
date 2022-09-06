package com.nyzs.eduonline.service.impl;

import com.github.pagehelper.PageHelper;
import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;
import com.nyzs.eduonline.dao.CoursewareDao;
import com.nyzs.eduonline.service.CoursewareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/1 13:42
 */
@Service
public class CoursewareServiceImpl implements CoursewareService {

    @Autowired
    CoursewareDao coursewareDao;

    @Override
    public List<CoursewareInfoDto> getCoursewareByPosOrTitle(String pos, String title) throws Exception {
//        PageHelper.startPage(page, pageSize);
        return coursewareDao.getCoursewareByPosOrTitle(pos, title);
    }

    @Override
    public void addCoursewareInfo(String serverFileName) throws Exception {
        String[] nameArray = serverFileName.split(" / ");
        String coursewareName = nameArray[0];
        String serverStorageName = nameArray[1];
        String storagePath = "courseware/" + serverStorageName;

        CoursewareInfoDto coursewareInfoDto = new CoursewareInfoDto(coursewareName, storagePath);
        coursewareDao.addCoursewareInfo(coursewareInfoDto);
    }

    @Override
    public void deleteCoursewareInfo(Integer id) throws Exception {
        coursewareDao.deleteCoursewareInfo(id);
    }
}

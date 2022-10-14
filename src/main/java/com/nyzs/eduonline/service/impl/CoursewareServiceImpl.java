package com.nyzs.eduonline.service.impl;

import com.github.pagehelper.PageHelper;
import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;
import com.nyzs.eduonline.bean.dto.File;
import com.nyzs.eduonline.dao.CoursewareDao;
import com.nyzs.eduonline.service.CoursewareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：课件service
 * @date ：2022/9/1 13:42
 */
@Service
public class CoursewareServiceImpl implements CoursewareService {

    @Autowired
    CoursewareDao coursewareDao;

    @Override
    public List<CoursewareInfoDto> getCoursewareBySeminarOrTitle(String seminar, String title) throws Exception {
//        PageHelper.startPage(page, pageSize);
        return coursewareDao.getCoursewareBySeminarOrTitle(seminar, title);
    }

    @Override
    public void addCoursewareInfo(String seminar, List<File> uploadList) throws Exception {
        for(int i = 0; i < uploadList.size(); i++) {
            String coursewareName = uploadList.get(i).getFileName();
            String storagePath = uploadList.get(i).getStoragePath();
            CoursewareInfoDto coursewareInfoDto = new CoursewareInfoDto(seminar, coursewareName, storagePath);
            coursewareDao.addCoursewareInfo(coursewareInfoDto);
        }
    }

    @Override
    public void deleteCoursewareInfo(Integer id) throws Exception {
        coursewareDao.deleteCoursewareInfo(id);
    }
}

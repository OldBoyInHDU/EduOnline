package com.nyzs.eduonline.controller;

import com.github.pagehelper.PageInfo;
import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.CoursewareService;
import com.nyzs.eduonline.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：课件的Controller
 * @date ：2022/9/1 13:37
 */

@RequestMapping("/forum")
@RestController
public class CoursewareController {

    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    CoursewareService coursewareService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/coursewareManage/getCoursewareByPosOrTitle")
    public ResponseResult getCoursewareByPosOrTitle(
            @RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
            @RequestParam(name = "pageSize", required = true, defaultValue = "10") Integer pageSize,
            String pos, String title) {
        List<CoursewareInfoDto> coursewareInfoDtoList = null;
        try {
            coursewareInfoDtoList = coursewareService.getCoursewareByPosOrTitle(page, pageSize, pos, title);
            PageInfo pageInfo = new PageInfo(coursewareInfoDtoList);
            return ResponseResult.ok(pageInfo, "课件列表查询成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(), "课件列表查询失败");
        }
    }

    @RequestMapping("/coursewareUpload/coursewareUpload")
    public ResponseResult uploadVideo(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadCourseware(file);
            return ResponseResult.ok(filename, "课件上传成功");
        } catch (IOException e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(),"课件上传失败");
        }

    }
}

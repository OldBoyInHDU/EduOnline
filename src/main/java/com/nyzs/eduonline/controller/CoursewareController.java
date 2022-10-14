package com.nyzs.eduonline.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;
import com.nyzs.eduonline.bean.dto.File;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.CoursewareService;
import com.nyzs.eduonline.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：课件的Controller
 * @date ：2022/9/1 13:37
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/forum")
@RestController
public class CoursewareController {

    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    CoursewareService coursewareService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/coursewareManage/getCoursewareByPosOrTitle")
    public ResponseResult getCoursewareByPosOrTitle(String seminar, String title) {
        List<CoursewareInfoDto> coursewareInfoDtoList = null;
        try {
            coursewareInfoDtoList = coursewareService.getCoursewareBySeminarOrTitle(seminar, title);
//            PageInfo pageInfo = new PageInfo(coursewareInfoDtoList);
            return ResponseResult.ok(coursewareInfoDtoList, "课件列表查询成功");
        } catch (Exception e) {
            logger.error("程序错误", e);
            return ResponseResult.failed(e.getMessage(), "课件列表查询失败");
        }
    }

    @RequestMapping("/coursewareUpload/uploadCourseware")
    public ResponseResult uploadVideo(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadCourseware(file);
            return ResponseResult.ok(filename, "课件上传成功");
        } catch (IOException e) {
            logger.error("程序错误", e);
            return ResponseResult.failed(e.getMessage(),"课件上传失败");
        }

    }

    @RequestMapping(value = "/coursewareUpload/submitCoursewareInfo", method = RequestMethod.POST)
    public ResponseResult submitDocInfo(
            String seminar,
            String uploadListStr
//            @RequestBody List<File> uploadList 前端直接传list才能接收到，json化的接收不到
    ) {
        try {
            System.out.println(seminar);
//            System.out.println("uploadListStr:" + uploadListStr);
            List<File> uploadList = JSON.parseArray(uploadListStr, File.class);
//            System.out.println("uploadList:" + uploadList);

            coursewareService.addCoursewareInfo(seminar, uploadList);
            return ResponseResult.ok("提交成功");
        } catch (Exception e) {
            logger.error("程序错误", e);
            return ResponseResult.failed(e.getMessage(), "提交失败");
        }

    }

    @RequestMapping(value = "/coursewareManage/deleteCoursewareInfo", method = RequestMethod.DELETE)
    public ResponseResult deleteDocInfo(Integer id) {
        try {
            coursewareService.deleteCoursewareInfo(id);
            return ResponseResult.ok("删除成功");
        } catch (Exception e) {
            logger.error("程序错误", e);
            return ResponseResult.failed(e.getMessage(), "删除失败");
        }

    }
}

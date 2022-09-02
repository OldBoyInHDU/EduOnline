package com.nyzs.eduonline.controller;

import com.github.pagehelper.PageInfo;
import com.nyzs.eduonline.bean.dto.VideoFileInfoDto;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.UploadService;
import com.nyzs.eduonline.service.VideoService;
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
 * @description：视频相关 上传和管理
 * @date ：2022/9/1 12:39
 */

@RequestMapping("/positionLearning")
@RestController
public class VideoController {

    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    VideoService videoService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/videoManage/getVideoInfoByPosOrTitle")
    public ResponseResult getVideoInfoByPosOrTitle(
            @RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
            @RequestParam(name = "pageSize", required = true, defaultValue = "10") Integer pageSize,
            String pos, String title) {
        try {
            List<VideoFileInfoDto> videoFileInfoDtoList = videoService.getVideoInfoByPosOrTitle(page, pageSize, pos, title);
            PageInfo pageInfo = new PageInfo(videoFileInfoDtoList);
            return ResponseResult.ok(pageInfo, "视频列表查询成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(), "视频列表查询失败");
        }
    }

    @RequestMapping("/videoUpload/uploadVideo")
    public ResponseResult uploadVideo(
            @RequestParam("file") MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadVideo(file);
            return ResponseResult.ok(filename, "视频上传成功");
        } catch (IOException e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(),"视频上传失败");
        }

    }

}

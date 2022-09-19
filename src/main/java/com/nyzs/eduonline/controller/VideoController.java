package com.nyzs.eduonline.controller;

import com.github.pagehelper.PageInfo;
import com.nyzs.eduonline.bean.dto.VideoFileInfoDto;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.UploadService;
import com.nyzs.eduonline.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：视频相关 上传和管理
 * @date ：2022/9/1 12:39
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/positionLearning")
@RestController
public class VideoController {

    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    VideoService videoService;

    @Autowired
    UploadService uploadService;

    @RequestMapping(value = "/videoManage/getVideoInfoByPosOrTitle", method = RequestMethod.GET)
    public ResponseResult getVideoInfoByPosOrTitle(String pos, String title) {
        try {
            //pos 传进来是  片叶_开箱
            String position = "";
            if(pos != null && pos!= "") {
                position = pos.split("_")[1];
            }
            List<VideoFileInfoDto> videoFileInfoDtoList = videoService.getVideoInfoByPosOrTitle(position, title);
//            PageInfo pageInfo = new PageInfo(videoFileInfoDtoList);
            return ResponseResult.ok(videoFileInfoDtoList, "视频列表查询成功");
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

    @RequestMapping(value = "/videoUpload/submitVideoInfo", method = RequestMethod.POST)
    public ResponseResult submitVideoInfo(
            @RequestParam(name = "position", required = true, defaultValue = "未指定") String position,
            @RequestParam(name = "serverFileName") String serverFileName) {
        try {
            videoService.addVideoInfo(position, serverFileName);
            return ResponseResult.ok("提交成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(), "提交失败");
        }
    }

    @RequestMapping(value = "/videoManage/deleteVideoInfo", method = RequestMethod.DELETE)
    public ResponseResult deleteVideoInfo(Integer id) {
        try {
            videoService.deleteVideoInfo(id);
            return ResponseResult.ok("删除成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(), "删除失败");
        }

    }

}

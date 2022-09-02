package com.nyzs.eduonline.controller;

import com.nyzs.eduonline.bean.dto.VideoFileInfoDto;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/videoManage/getVideoInfoByPosOrTitle")
    public ResponseResult getVideoInfoByPosOrTitle(String pos, String title) {
        try {
            List<VideoFileInfoDto> videoFileInfoDtoList = videoService.getVideoInfoByPosOrTitle(pos, title);
            return ResponseResult.ok(videoFileInfoDtoList, "视频列表查询成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(), "视频列表查询失败");
        }
    }
}

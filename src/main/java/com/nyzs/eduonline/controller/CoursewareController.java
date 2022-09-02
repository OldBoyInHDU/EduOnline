package com.nyzs.eduonline.controller;

import com.github.pagehelper.PageInfo;
import com.nyzs.eduonline.bean.dto.CoursewareInfoDto;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.CoursewareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/1 13:37
 */

@RequestMapping("/forum")
@RestController
public class CoursewareController {

    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    CoursewareService coursewareService;

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
}

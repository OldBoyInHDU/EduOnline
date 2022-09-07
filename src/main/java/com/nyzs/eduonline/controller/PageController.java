package com.nyzs.eduonline.controller;

import com.nyzs.eduonline.bean.dto.PageInfoDto;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.PageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/7 9:27
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/page")
@RestController
public class PageController {

    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    PageService pageService;

    @RequestMapping(value = "/getPageInfo", method = RequestMethod.GET)
    public ResponseResult getPageInfo(String pos) {
//        System.out.println("Pos:" + pos);
        //pos 传进来是  片叶_开箱
        String position = "";
        if(pos != null && pos!= "") {
            position = pos.split("_")[1];
        }
        List<PageInfoDto> pageInfoDtoList = null;
        try {
            pageInfoDtoList = pageService.getPageInfo(position);
            return ResponseResult.ok(pageInfoDtoList, "页面信息查询成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(), "页面查询失败");
        }


    }
}

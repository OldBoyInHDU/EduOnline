package com.nyzs.eduonline.controller;

import com.nyzs.eduonline.bean.dto.PositionInfoDto;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.PositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：岗位controller
 * @date ：2022/9/13 7:55
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/position")
@RestController
public class PositionController {

    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    PositionService positionService;

    @RequestMapping(value = "/getPositionList", method = RequestMethod.GET)
    public ResponseResult getPositionList() {
        HashMap<String, List<PositionInfoDto>> positionInfoDtoMap = null;
        try {
            positionInfoDtoMap = positionService.getPositionList();
            return ResponseResult.ok(positionInfoDtoMap, "岗位查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("程序错误", e);
            return ResponseResult.failed(e.getMessage());
        }

    }
}

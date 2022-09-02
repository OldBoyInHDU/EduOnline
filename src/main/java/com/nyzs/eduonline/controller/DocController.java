package com.nyzs.eduonline.controller;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.service.DocService;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：文档相关 （管理上传）
 * @date ：2022/9/1 9:37
 */

@RequestMapping("/positionLearning")
@RestController
public class DocController {
    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    DocService docService;

    @RequestMapping(value = "/docManage/getDocByPosOrTypeOrTitle")
    public ResponseResult getDocByPosOrTypeOrTitle(String pos, String type, String title) {
        try {
            List<DocFileInfoDto> fileInfoListDto = docService.getDocByPosOrTypeOrTitle(pos, type, title);
            return ResponseResult.ok( fileInfoListDto, "获取文档列表成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(), "获取文档列表失败");
        }
    }
}

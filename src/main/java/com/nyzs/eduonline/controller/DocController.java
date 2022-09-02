package com.nyzs.eduonline.controller;

import com.github.pagehelper.PageInfo;
import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.service.DocService;
import com.nyzs.eduonline.bean.vo.ResponseResult;
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
 * @description：文档相关 （管理上传）
 * @date ：2022/9/1 9:37
 */

@RequestMapping("/positionLearning")
@RestController
public class DocController {
    private static Logger logger = LoggerFactory.getLogger(DocController.class);

    @Autowired
    DocService docService;

    @Autowired
    UploadService uploadService;

    /**
     *
     * @param page 页数_第几页
     * @param pageSize 单页面展示的数据的数量 / size是页面的数量 不要混淆
     * @param pos
     * @param type
     * @param title
     * @return
     */
    @RequestMapping(value = "/docManage/getDocByPosOrTypeOrTitle")
    public ResponseResult getDocByPosOrTypeOrTitle(
            @RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
            @RequestParam(name = "pageSize", required = true, defaultValue = "10") Integer pageSize,
            String pos, String type, String title) {
        try {
            List<DocFileInfoDto> fileInfoListDto = docService.getDocByPosOrTypeOrTitle(page, pageSize, pos, type, title);
            PageInfo pageInfo = new PageInfo(fileInfoListDto);
            return ResponseResult.ok( pageInfo, "获取文档列表成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(), "获取文档列表失败");
        }
    }

    @RequestMapping("/docUpload/uploadDoc")
    public ResponseResult uploadDoc(
            @RequestParam("file")MultipartFile file
            ) {
        String filename = null;
        try {
            filename = uploadService.uploadDoc(file);
            return ResponseResult.ok(filename, "文件上传成功");
        } catch (IOException e) {
            logger.error(e.getMessage());
            return ResponseResult.failed(e.getMessage(),"文件上传失败");
        }

    }
}

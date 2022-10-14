package com.nyzs.eduonline.controller;

import com.alibaba.fastjson.JSON;
import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.bean.dto.File;
import com.nyzs.eduonline.bean.vo.ResponseResult;
import com.nyzs.eduonline.service.DocService;
import com.nyzs.eduonline.service.SocService;
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
 * @description：SOC相关 （管理上传）
 * @date ：2022/9/1 9:37
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/positionLearning")
@RestController
public class SocController {
    private static Logger logger = LoggerFactory.getLogger(SocController.class);

    @Autowired
    SocService socService;

    @Autowired
    UploadService uploadService;

    /**
     *
     *
     * @param pos
     * @param type
     * @param title
     * @return
     */
    @RequestMapping(value = "/socManage/getSocByPosOrTitle", method = RequestMethod.GET)
    public ResponseResult getDocByPosOrTitle(String pos, String type, String title) {

        try {
            //pos 传进来是  片叶_开箱
            String position = "";
            if(pos != null && pos.length() != 0) {
                position = pos.split("_")[1];
            }
            List<DocFileInfoDto> fileInfoListDto = socService.getSocByPosOrTitle(position, type, title);
//            System.out.println(fileInfoListDto);
//            PageInfo pageInfo = new PageInfo(fileInfoListDto);
            return ResponseResult.ok(fileInfoListDto, "获取文档列表成功");
        } catch (Exception e) {
            logger.error("程序错误", e);
//            System.out.println(e.getCause());
            return ResponseResult.failed(e.getMessage(), "获取文档列表失败");
        }
    }

    @RequestMapping(value = "/socUpload/uploadSoc", method = RequestMethod.POST)
    public ResponseResult uploadDoc(
            @RequestParam("file")MultipartFile file
    ) {
        String filename = null;
        try {
            filename = uploadService.uploadSoc(file);
            return ResponseResult.ok(filename, "文档上传成功");
        } catch (IOException e) {
            logger.error("程序错误", e);
            return ResponseResult.failed(e.getMessage(),"文档上传失败");
        }

    }

    @RequestMapping(value = "/socUpload/submitSocInfo", method = RequestMethod.POST)
    public ResponseResult submitSocInfo(
            String position,
            String uploadListStr
//            @RequestBody List<File> uploadList 前端直接传list才能接收到，json化的接收不到
    ) {
        try {
            System.out.println(position);
//            System.out.println("uploadListStr:" + uploadListStr);
            List<File> uploadList = JSON.parseArray(uploadListStr, File.class);
//            System.out.println("uploadList:" + uploadList);

            socService.addSocInfo(position, uploadList);
            return ResponseResult.ok("提交成功");
        } catch (Exception e) {
            logger.error("程序错误", e);
            return ResponseResult.failed(e.getMessage(), "提交失败");
        }

    }

    @RequestMapping(value = "/socManage/deleteSocInfo", method = RequestMethod.DELETE)
    public ResponseResult deleteSocInfo(Integer id) {
        try {
            socService.deleteSocInfo(id);
            return ResponseResult.ok("删除成功");
        } catch (Exception e) {
            logger.error("程序错误", e);
            return ResponseResult.failed(e.getMessage(), "删除失败");
        }

    }


}

package com.nyzs.eduonline.service.impl;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.bean.dto.PageInfoDto;
import com.nyzs.eduonline.bean.dto.VideoFileInfoDto;
import com.nyzs.eduonline.dao.DocDao;
import com.nyzs.eduonline.dao.PageDao;
import com.nyzs.eduonline.dao.VideoDao;
import com.nyzs.eduonline.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/7 9:35
 */
@Service
public class PageServiceImpl implements PageService {

    @Autowired
    PageDao pageDao;

    @Autowired
    DocDao docDao;

    @Autowired
    VideoDao videoDao;

    @Override
    public List<PageInfoDto> getPageInfo(String pos) throws Exception {
        List<PageInfoDto> list = pageDao.getPageInfo(pos);
        System.out.println(list);
        return list;
    }

    @Override
    public void submitPageInfo(String position, String docServerFileName, String socServerFileName, String vidServerFileName, String posResponsibility) throws Exception {
        String[] positionArray = position.split("_");
        String[] docNameArray = docServerFileName.split(" / ");
        String[] socNameArray = socServerFileName.split(" / ");
        String[] vidNameArray = vidServerFileName.split(" / ");

        String unit = positionArray[0];
        String pos = positionArray[1];
        String docFileName = docNameArray[0];
        String docStoragePath = "doc/" + docNameArray[1];
        String socFileName = socNameArray[0];
        String socStoragePath = "doc/" + socNameArray[1];
        String videoFileName = vidNameArray[0];
        String videoStoragePath = "vid/" + vidNameArray[1];

        PageInfoDto pageInfoDto = new PageInfoDto(unit, pos, posResponsibility, docFileName, docStoragePath, socFileName, socStoragePath, videoFileName, videoStoragePath);
//        DocFileInfoDto docFileInfoDto = new DocFileInfoDto(docFileName, unit, pos, docStoragePath);
//        VideoFileInfoDto videoFileInfoDto = new VideoFileInfoDto(videoFileName, unit, pos, videoStoragePath);
        if (pageDao.getPageInfo(pos).size() > 0) {
            System.out.println("update:" + pageInfoDto);
            pageDao.updatePageInfo(pageInfoDto);
        } else {
            System.out.println("add:" + pageInfoDto);
            pageDao.addPageInfo(pageInfoDto);
        }

//        docDao.addDocInfo(docFileInfoDto);
//        videoDao.addVideoInfo(videoFileInfoDto);

    }
}

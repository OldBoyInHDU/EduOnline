package com.nyzs.eduonline.service.impl;

import com.github.pagehelper.PageHelper;
import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.bean.dto.VideoFileInfoDto;
import com.nyzs.eduonline.dao.VideoDao;
import com.nyzs.eduonline.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：
 * @date ：2022/9/1 12:46
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoDao videoDao;

    @Override
    public List<VideoFileInfoDto> getVideoInfoByPosOrTitle(String pos, String title) throws Exception {
//        PageHelper.startPage(page, pageSize);
        return videoDao.getVideoInfoByPosOrTitle(pos, title);
    }

    @Override
    public void addVideoInfo(String position, String serverFileName) throws Exception {
        String[] nameArray = serverFileName.split(" / ");
        String[] positionArray = position.split("_");
        String videoFileName = nameArray[0];
        String serverStorageName = nameArray[1];
        String unit = positionArray[0];
        String pos = positionArray[1];
        String storagePath = "video/" + serverStorageName;

        VideoFileInfoDto videoFileInfoDto = new VideoFileInfoDto(videoFileName, unit, pos, storagePath);
        videoDao.addVideoInfo(videoFileInfoDto);
    }

    @Override
    public void deleteVideoInfo(Integer id) throws Exception {
        videoDao.deleteVideoInfo(id);
    }
}

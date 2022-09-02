package com.nyzs.eduonline.service.impl;

import com.github.pagehelper.PageHelper;
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
    public List<VideoFileInfoDto> getVideoInfoByPosOrTitle(int page, int pageSize, String pos, String title) throws Exception {
        PageHelper.startPage(page, pageSize);
        return videoDao.getVideoInfoByPosOrTitle(pos, title);
    }
}

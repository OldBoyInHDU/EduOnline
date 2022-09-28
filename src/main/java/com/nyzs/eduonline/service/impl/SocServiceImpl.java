package com.nyzs.eduonline.service.impl;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.dao.DocDao;
import com.nyzs.eduonline.dao.SocDao;
import com.nyzs.eduonline.service.DocService;
import com.nyzs.eduonline.service.SocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：文档service
 * @date ：2022/9/1 10:23
 */
@Service
public class SocServiceImpl implements SocService {

    @Autowired
    SocDao socDao;

    @Override
    public List<DocFileInfoDto> getSocByPosOrTitle(String pos, String type, String title) throws Exception {
        return socDao.getSocByPosOrTitle(pos, title);
    }




}

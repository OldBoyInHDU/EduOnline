package com.nyzs.eduonline.service.impl;

import com.nyzs.eduonline.bean.dto.PageInfoDto;
import com.nyzs.eduonline.dao.PageDao;
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

    @Override
    public List<PageInfoDto> getPageInfo(String pos) throws Exception {
        return pageDao.getPageInfo(pos);
    }
}

package com.nyzs.eduonline.service.impl;

import com.github.pagehelper.PageHelper;
import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.dao.DocDao;
import com.nyzs.eduonline.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/1 10:23
 */
@Service
public class DocServiceImpl implements DocService {

    @Autowired
    DocDao docDao;

    @Override
    public List<DocFileInfoDto> getDocByPosOrTypeOrTitle(int page, int pageSize, String pos, String type, String title) throws Exception {
//        System.out.println("page:" + page + "---" + "size:" + pageSize);
        PageHelper.startPage(page, pageSize);
        return docDao.getDocByPosOrTypeOrTitle(pos, type, title);
    }
}

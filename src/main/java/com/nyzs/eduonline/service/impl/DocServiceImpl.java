package com.nyzs.eduonline.service.impl;

import com.github.pagehelper.PageHelper;
import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.bean.dto.File;
import com.nyzs.eduonline.dao.DocDao;
import com.nyzs.eduonline.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：文档service
 * @date ：2022/9/1 10:23
 */
@Service
public class DocServiceImpl implements DocService {

    @Autowired
    DocDao docDao;

    @Override
    public List<DocFileInfoDto> getDocByPosOrTitle(String pos, String type, String title) throws Exception {
//        System.out.println("page:" + page + "---" + "size:" + pageSize);

//        PageHelper.startPage(page, pageSize);
        return docDao.getDocByPosOrTitle(pos, title);
    }

    @Override
    public void addDocInfo(String position, List<File> uploadList) throws Exception {
        String[] positionArray = position.split("_");
        String unit = positionArray[0];
        String pos = positionArray[1];

        for(int i = 0; i < uploadList.size(); i++) {
            String docFilename = uploadList.get(i).getFileName();
            String storagePath = uploadList.get(i).getStoragePath();
            DocFileInfoDto docFile = new DocFileInfoDto(docFilename, unit, pos, storagePath);
            docDao.addDocInfo(docFile);
        }
    }

    @Override
    public void deleteDocInfo(Integer id) throws Exception {
        docDao.deleteDocInfo(id);
    }


}

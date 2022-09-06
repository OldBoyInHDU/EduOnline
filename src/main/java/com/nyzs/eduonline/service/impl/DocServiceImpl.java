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
 * @description：文档service
 * @date ：2022/9/1 10:23
 */
@Service
public class DocServiceImpl implements DocService {

    @Autowired
    DocDao docDao;

    @Override
    public List<DocFileInfoDto> getDocByPosOrTypeOrTitle(String pos, String type, String title) throws Exception {
//        System.out.println("page:" + page + "---" + "size:" + pageSize);

//        PageHelper.startPage(page, pageSize);
        return docDao.getDocByPosOrTypeOrTitle(pos, type, title);
    }

    @Override
    public void addDocInfo(String position, String type, String serverFileName) throws Exception {
        String[] nameArray = serverFileName.split(" / ");
        String[] positionArray = position.split("_");
        String docFileName = nameArray[0];
        String serverStorageName = nameArray[1];
        String docFileType = type;
        String unit = positionArray[0];
        String pos = positionArray[1];
        String storagePath = "doc/" + serverStorageName;

        DocFileInfoDto docFileInfo = new DocFileInfoDto(docFileName, docFileType, unit, pos, storagePath);
        docDao.addDocInfo(docFileInfo);
    }

    @Override
    public void deleteDocInfo(Integer id) throws Exception {
        docDao.deleteDocInfo(id);
    }


}

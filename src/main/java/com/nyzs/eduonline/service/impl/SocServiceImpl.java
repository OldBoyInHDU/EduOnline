package com.nyzs.eduonline.service.impl;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.bean.dto.File;
import com.nyzs.eduonline.bean.dto.SocFileInfoDto;
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
    public void deleteSocInfo(Integer id) throws Exception {
        socDao.deleteSocInfo(id);
    }

    @Override
    public List<DocFileInfoDto> getSocByPosOrTitle(String pos, String type, String title) throws Exception {
        return socDao.getSocByPosOrTitle(pos, title);
    }

    @Override
    public void addSocInfo(String position, List<File> uploadList) throws Exception {
        String[] positionArray = position.split("_");
        String unit = positionArray[0];
        String pos = positionArray[1];

        for(int i = 0; i < uploadList.size(); i++) {
            String docFilename = uploadList.get(i).getFileName();
            String storagePath = uploadList.get(i).getStoragePath();
            SocFileInfoDto socFile = new SocFileInfoDto(docFilename, unit, pos, storagePath);
            socDao.addSocInfo(socFile);
        }
    }




}

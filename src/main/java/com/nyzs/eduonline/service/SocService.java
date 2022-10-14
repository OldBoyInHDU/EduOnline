package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.bean.dto.File;

import java.util.List;


public interface SocService {

    void deleteSocInfo(Integer id) throws Exception;

    List<DocFileInfoDto> getSocByPosOrTitle(String pos, String type, String title) throws Exception;

    void addSocInfo(String position, List<File> uploadList) throws Exception;
}

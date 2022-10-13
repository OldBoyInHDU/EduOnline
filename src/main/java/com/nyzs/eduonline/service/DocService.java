package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import com.nyzs.eduonline.bean.dto.File;

import java.util.List;


public interface DocService {

    List<DocFileInfoDto> getDocByPosOrTitle(String pos, String type, String title) throws Exception;

    void addDocInfo(String position, List<File> uploadList) throws Exception;

    void deleteDocInfo(Integer id) throws Exception;
}

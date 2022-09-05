package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;

import java.util.List;


public interface DocService {

    List<DocFileInfoDto> getDocByPosOrTypeOrTitle(String pos, String type, String title) throws Exception;

    void addDocInfo(String position, String type, String serverFileName) throws Exception;

    void deleteDocInfo(Integer id) throws Exception;
}

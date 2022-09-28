package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;

import java.util.List;


public interface SocService {

    List<DocFileInfoDto> getSocByPosOrTitle(String pos, String type, String title) throws Exception;
}

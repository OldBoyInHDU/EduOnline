package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;

import java.util.List;


public interface DocService {

    List<DocFileInfoDto> getDocByPosOrTypeOrTitle(int page, int pageSize, String pos, String type, String title) throws Exception;

}

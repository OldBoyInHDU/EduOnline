package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.PageInfoDto;

import java.util.List;

public interface PageService {
    List<PageInfoDto> getPageInfo(String pos) throws Exception;
}

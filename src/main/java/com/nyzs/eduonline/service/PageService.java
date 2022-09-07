package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.PageInfoDto;

public interface PageService {
    PageInfoDto getPageInfo(String pos) throws Exception;
}

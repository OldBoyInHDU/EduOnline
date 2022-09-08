package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.PageInfoDto;

import java.util.List;

public interface PageService {
    List<PageInfoDto> getPageInfo(String pos) throws Exception;

    void submitPageInfo(String position, String docServerFileName, String socServerFileName, String vidServerFileName, String posResponsibility) throws Exception;
}

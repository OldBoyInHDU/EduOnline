package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.PageInfoDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PageDao {

    PageInfoDto getPageInfo(String pos) throws Exception;
}

package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.PageInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PageDao {

    List<PageInfoDto> getPageInfo(String pos) throws Exception;
}

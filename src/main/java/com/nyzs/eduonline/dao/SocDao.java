package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SocDao {
    List<DocFileInfoDto> getSocByPosOrTitle(String pos, String title) throws Exception;

}

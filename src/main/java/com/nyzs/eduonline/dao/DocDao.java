package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocDao {
    List<DocFileInfoDto> getDocByPosOrTypeOrTitle(String pos, String type, String title) throws Exception;

    void addDocInfo(DocFileInfoDto docFileInfo);
}

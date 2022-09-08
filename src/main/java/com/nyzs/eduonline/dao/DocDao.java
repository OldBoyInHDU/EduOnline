package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.DocFileInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocDao {
    List<DocFileInfoDto> getDocByPosOrTitle(String pos, String title) throws Exception;

    void addDocInfo(DocFileInfoDto docFileInfo) throws Exception;

    void deleteDocInfo(Integer id) throws Exception;
}

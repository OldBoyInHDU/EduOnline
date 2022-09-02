package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.VideoFileInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoDao {

    List<VideoFileInfoDto> getVideoInfoByPosOrTitle(String pos, String title) throws Exception;
}

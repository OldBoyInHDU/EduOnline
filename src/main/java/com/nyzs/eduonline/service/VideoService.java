package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.VideoFileInfoDto;

import java.util.List;

public interface VideoService {

    List<VideoFileInfoDto> getVideoInfoByPosOrTitle(String pos, String title) throws Exception;

    void addVideoInfo(String position, String serverFileName) throws Exception;

    void deleteVideoInfo(Integer id) throws Exception;
}

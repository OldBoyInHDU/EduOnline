package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.VideoFileInfoDto;

import java.util.List;

public interface VideoService {

    List<VideoFileInfoDto> getVideoInfoByPosOrTitle(int page, int pageSize, String pos, String title) throws Exception;
}

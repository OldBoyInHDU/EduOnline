package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.PositionInfoDto;

import java.util.HashMap;
import java.util.List;

public interface PositionService {
    HashMap<String, List<PositionInfoDto>> getPositionList() throws Exception;
}

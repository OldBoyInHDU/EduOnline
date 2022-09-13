package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.PositionInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PositionDao {

    List<PositionInfoDto> getPositionList(String unit) throws Exception;
}

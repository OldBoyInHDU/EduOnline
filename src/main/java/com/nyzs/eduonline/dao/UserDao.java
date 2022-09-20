package com.nyzs.eduonline.dao;

import com.nyzs.eduonline.bean.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User getByAccount(String account) throws Exception;
}

package com.nyzs.eduonline.service;

import com.nyzs.eduonline.bean.dto.User;

public interface UserService {

    User getByAccount(String account) throws Exception;
}

package com.nyzs.eduonline.service.impl;

import com.nyzs.eduonline.bean.dto.User;
import com.nyzs.eduonline.dao.UserDao;
import com.nyzs.eduonline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/20 8:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getByAccount(String account) throws Exception {
        return userDao.getByAccount(account);
    }
}

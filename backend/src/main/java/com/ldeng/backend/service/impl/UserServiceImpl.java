package com.ldeng.backend.service.impl;

import com.ldeng.backend.dao.UserDao;
import com.ldeng.backend.model.User;
import com.ldeng.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by d_garcia on 06/09/2016.
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }


}

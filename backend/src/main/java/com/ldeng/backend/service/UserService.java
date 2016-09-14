package com.ldeng.backend.service;

import com.ldeng.backend.model.User;

/**
 * Created by d_garcia on 06/09/2016.
 */
public interface UserService {
    User save(User save);
    User findByUserName(String userName);
}

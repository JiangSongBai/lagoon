package com.ldeng.backend.dao;

import com.ldeng.backend.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by d_garcia on 06/09/2016.
 */

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User save(User save);
    User findByUserName(String userName);
}

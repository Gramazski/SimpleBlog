package com.gramazski.blog.service.impl;

import com.gramazski.blog.entity.User;
import com.gramazski.blog.repository.UserRepository;
import com.gramazski.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gs on 03.02.2017.
 */
@Service("jpaContactService")
@Transactional
public class UserService implements IUserService {
    @Qualifier("userRepository")
    @Autowired
    private UserRepository userRepository;

    public User findOne(int id) {
        return userRepository.findOne(id);
    }
}

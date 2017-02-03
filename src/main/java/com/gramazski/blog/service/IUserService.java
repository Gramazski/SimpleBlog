package com.gramazski.blog.service;

import com.gramazski.blog.entity.User;

/**
 * Created by gs on 03.02.2017.
 */
public interface IUserService {
    User findOne(int id);
}

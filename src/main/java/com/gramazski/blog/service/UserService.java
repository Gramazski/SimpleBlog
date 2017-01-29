package com.gramazski.blog.service;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gs on 29.01.2017.
 */
@Service("userService")
@Transactional
public class UserService {
    //@Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
}

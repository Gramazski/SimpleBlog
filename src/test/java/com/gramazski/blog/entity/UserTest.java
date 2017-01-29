package com.gramazski.blog.entity;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import org.hibernate.cfg.Configuration;

/**
 * Created by gs on 29.01.2017.
 */
public class UserTest {
    @Test
    public void testHibernateWork(){
        User user = new User();
        user.setNickName("stas");
        user.setPassword("00");
        user.setEmail("ee");
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.beginTransaction();

        session.save(user);

        session.getTransaction().commit();

        User newUser = session.get(User.class, 0);

        Assert.assertFalse(false);
    }

}
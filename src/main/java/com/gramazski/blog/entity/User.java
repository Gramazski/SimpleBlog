package com.gramazski.blog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by gs on 03.02.2017.
 */
@Entity
@Table
public class User {
    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NICKNAME")
    private String nickName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAIL")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

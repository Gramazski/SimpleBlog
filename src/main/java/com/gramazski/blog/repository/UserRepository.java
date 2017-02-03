package com.gramazski.blog.repository;

import com.gramazski.blog.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gs on 03.02.2017.
 */
@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Integer> {
}

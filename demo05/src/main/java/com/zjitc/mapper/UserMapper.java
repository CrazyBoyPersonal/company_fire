package com.zjitc.mapper;

import com.zjitc.pojo.User;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/8 14:31
 * @description:
 */
public interface UserMapper {

  //@Select("SELECT * FROM users WHERE id = #{id}")
  User findById(Integer id);
}

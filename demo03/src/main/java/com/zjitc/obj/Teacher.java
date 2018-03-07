package com.zjitc.obj;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/7 14:41
 * @description:
 */
public class Teacher {

  @Autowired
  private User user;

  public User getUser() {
    return user;
  }

  public User serUser(User user) {
    return this.user;
  }
}

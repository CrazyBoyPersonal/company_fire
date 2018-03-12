package com.zjitc.config;

import com.zjitc.obj.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create with IntelliJ IDEA
 * User : kevin
 * Dare : 2018/3/9
 * Time : 13:43
 * To change this template use File | Setting | File Template.
 * Description :
 */

@Configuration

public class JavaConfig {

  @Bean
  public User user() {
    User user = new User("default name", 10);
    return user;
  }

}

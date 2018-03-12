package com.zjitc.config;

import com.zjitc.obj.Teacher;
import com.zjitc.obj.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Create with IntelliJ IDEA
 * User : kevin
 * Dare : 2018/3/9
 * Time : 14:28
 * To change this template use File | Setting | File Template.
 * Description :
 */

@Configuration
@Import(JavaConfig.class)
public class JavaConfig2 {

  @Bean
  public Teacher teacher(User user) {
    return new Teacher(user);
  }
}

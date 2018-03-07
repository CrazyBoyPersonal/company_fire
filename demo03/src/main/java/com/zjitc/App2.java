package com.zjitc;

import com.zjitc.obj.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/7 14:43
 * @description:
 */
public class App2 {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

    User user = context.getBean("user", User.class);

    System.out.println(user);

  }

}

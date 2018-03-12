package com.zjitc;

import com.zjitc.obj.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App1 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("main-config.xml");
    User user1 = context.getBean("user1", User.class);

    System.out.println(user1.toString());

  }
}

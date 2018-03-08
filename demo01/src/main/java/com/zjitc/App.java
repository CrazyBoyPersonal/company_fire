package com.zjitc;

import com.zjitc.obj.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("demo-spring.xml");
    User user1 = context.getBean("user1", User.class);
    User user2 = context.getBean("user2", User.class);
    User user3 = context.getBean("user3", User.class);
    User user4 = context.getBean("user4", User.class);

    System.out.println(user1.toString());
    System.out.println(user2.toString());
    System.out.println(user3.toString());
    System.out.println(user4.toString());
    //    System.out.printn("Hello World!");

    ((ClassPathXmlApplicationContext)context).close();
  }
}

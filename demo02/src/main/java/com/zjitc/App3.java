package com.zjitc;

import com.zjitc.config.JavaConfig2;
import com.zjitc.obj.Teacher;
import com.zjitc.obj.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create with IntelliJ IDEA
 * User : kevin
 * Dare : 2018/3/9
 * Time : 13:41
 * To change this template use File | Setting | File Template.
 * Description :
 */
public class App3 {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig2.class);
    User user = context.getBean("user", User.class);
    Teacher teacher = context.getBean("teacher", Teacher.class);
    System.out.println(user.toString());
    System.out.println(teacher.toString());
  }
}

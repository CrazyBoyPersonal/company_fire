package com.zjitc;

import com.zjitc.scan.C;
import com.zjitc.scan.obj.A;
import com.zjitc.scan.obj.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/7 15:46
 * @description:
 */
public class App4 {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Configuration1.class);
    A a = context.getBean(A.class);
    B b = context.getBean(B.class);
    C c = context.getBean(C.class);
    System.out.println(a);
    System.out.println(b);
    System.out.println(a.getB());
    System.out.println(c);
  }

}

package com.zjitc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Create with IntelliJ IDEA
 * User : kevin
 * Dare : 2018/3/9
 * Time : 10:55
 * To change this template use File | Setting | File Template.
 * Description :
 */
public class App2 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("hikariCP-spring-config.xml");
    DataSource bean = context.getBean(DataSource.class);
    try {
      Connection connection =  bean.getConnection();
      System.out.println(connection);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

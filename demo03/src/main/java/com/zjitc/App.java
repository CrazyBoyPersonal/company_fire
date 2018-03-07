package com.zjitc;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
        Datasourceconfig.class);
    DataSource source = annotationConfigApplicationContext.getBean("dataSource", DataSource.class);

    try {
      source.getConnection();
      System.out.println(source.getConnection());
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}

package com.zjitc;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/7 14:02
 * @description:
 */

@Configuration
@PropertySource("classpath:db.properties")
public class Datasourceconfig {

  @Value("${jdbc.driver}")
  private String driver;

  @Value("${jdbc.username}")
  private String username;

  @Value("${jdbc.password}")
  private String password;

  @Value("${jdbc.url}")
  private String url;

  @Bean
  public DataSource dataSource() {
    HikariDataSource dataSource = new HikariDataSource();

    dataSource.setUsername(this.username);
    dataSource.setPassword(this.password);
    dataSource.setDriverClassName(this.driver);
    dataSource.setJdbcUrl(this.url);

    return dataSource;
  }
}

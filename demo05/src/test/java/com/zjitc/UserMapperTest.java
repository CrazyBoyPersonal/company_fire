package com.zjitc;

import com.zjitc.mapper.UserMapper;
import com.zjitc.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/8 15:10
 * @description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:mybatis-spring-config.xml")
public class UserMapperTest {

  @Autowired
  private UserMapper userMapper;

  @Test
  public void findById() {
    User user = userMapper.findById(1);
    Assert.assertEquals(1, user.getId().intValue());
    Assert.assertEquals(12, user.getAge().intValue());
    Assert.assertEquals("Kevin",user.getName());
  }

}

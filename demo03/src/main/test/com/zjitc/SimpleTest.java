package com.zjitc;

import com.zjitc.scan.obj.A;
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
 * @date-Time: 2018/3/7 16:12
 * @description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Configuration1.class)
@ContextConfiguration(locations = "classpath:scan-spring-config.xml")
public class SimpleTest {

  @Autowired
  private A a;

  @Test
  public void ObjB() {
    Assert.assertNotNull(a.getB());
  }
}

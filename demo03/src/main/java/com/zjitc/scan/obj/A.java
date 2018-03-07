package com.zjitc.scan.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/7 15:10
 * @description:
 */

@Component
public class A {
  @Autowired
  private B b;

  public B getB() {
    return b;
  }
}

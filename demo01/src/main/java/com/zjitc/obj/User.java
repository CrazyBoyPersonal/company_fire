package com.zjitc.obj;

/**
 * Create with IntelliJ IDEA
 * User : kevin
 * Dare : 2018/3/8
 * Time : 10:40
 * To change this template use File | Setting | File Template.
 * Description :
 */
public class User {

  private String name;
  private Integer age;

  public User() {
    this("body", 10);
  }


  public void setAge(Integer age) {
    this.age = age;
  }

  public User(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void init() {
    System.out.println("init");
  }

  public void destroy() {
    System.out.println("destroy");
  }

  public Integer getAge() {
    return age;
  }

  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public static User createInstance(Integer age) {
    if (age >= 100) {
      return new User("bigger than 100", age);
    } else {
      return new User("smaller than 100", age);
    }
  }
}

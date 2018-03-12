package com.zjitc.obj;

/**
 * Create with IntelliJ IDEA
 * User : kevin
 * Dare : 2018/3/9
 * Time : 14:27
 * To change this template use File | Setting | File Template.
 * Description :
 */
public class Teacher {
  private User user;

  public Teacher(User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Teacher{" +
        "user=" + user +
        '}';
  }
}

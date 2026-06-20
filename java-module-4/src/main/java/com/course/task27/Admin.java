package com.course.task27;

/**
 * Администратор — пользователь с максимальной скидкой.
 */
public class Admin extends User {

  public Admin(String username) {
    super(username);
  }

  @Override
  public int getDiscountPercent() {
    return 50;
  }
}

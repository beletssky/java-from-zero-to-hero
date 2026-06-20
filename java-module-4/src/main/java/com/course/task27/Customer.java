package com.course.task27;

/**
 * Покупатель — пользователь с базовой скидкой.
 */
public class Customer extends User {

  public Customer(String username) {
    super(username);
  }

  @Override
  public int getDiscountPercent() {
    return 10;
  }
}

package com.course.task27;

/**
 * Абстрактный пользователь системы.
 * Определяет контракт получения процента скидки.
 */
public abstract class User {
  protected String username;

  public User(String username) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public String getUsername() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public abstract int getDiscountPercent();
}

package com.course.task27;

/**
 * Абстрактный пользователь системы.
 * Определяет контракт получения процента скидки.
 */
public abstract class User {
    protected String username;

    public User(String username) {
        // TODO: реализуй
        this.username = username;
    }

    public String getUsername() {
        // TODO: реализуй
        return username;
    }

    public abstract int getDiscountPercent();
}

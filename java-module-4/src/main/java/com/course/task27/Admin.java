package com.course.task27;

/**
 * Администратор — пользователь с максимальной скидкой.
 */
public class Admin extends User {
    private static final int MAXIMUM_DISCOUNT = 50;

    public Admin(String username) {
        super(username);
        // TODO: реализуй
    }

    @Override
    public int getDiscountPercent() {
        // TODO: реализуй
        return MAXIMUM_DISCOUNT;
    }
}

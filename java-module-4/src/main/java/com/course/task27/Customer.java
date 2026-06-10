package com.course.task27;

/**
 * Покупатель — пользователь с базовой скидкой.
 */
public class Customer extends User {
    private static final int MINIMUM_DISCOUNT = 10;

    public Customer(String username) {
        super(username);
        // TODO: реализуй
    }

    @Override
    public int getDiscountPercent() {
        // TODO: реализуй
        return MINIMUM_DISCOUNT;
    }
}

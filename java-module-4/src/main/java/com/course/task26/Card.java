package com.course.task26;

/**
 * Платёж картой — есть лимит на одну операцию.
 */
public class Card extends PaymentProcessor {
    private static final long LIMIT = 100000L;

    @Override
    public boolean process(long amount) {
        // TODO: реализуй
        return amount <= LIMIT;
    }
}

package com.course.task26;

/**
 * Платёж наличными — всегда успешен.
 */
public class Cash extends PaymentProcessor {

    @Override
    public boolean process(long amount) {
        // TODO: реализуй
        return true;
    }
}

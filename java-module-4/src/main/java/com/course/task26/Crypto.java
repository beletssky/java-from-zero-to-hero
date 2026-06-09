package com.course.task26;

/**
 * Криптоплатёж — есть минимальный порог суммы.
 */
public class Crypto extends PaymentProcessor {
    private static final long MINIMUM = 1000L;

    @Override
    public boolean process(long amount) {
        // TODO: реализуй
        return amount >= MINIMUM;
    }
}

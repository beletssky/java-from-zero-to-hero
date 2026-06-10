package com.course.task26;

/**
 * Абстрактный обработчик платежей.
 * Определяет контракт обработки и шаблонный метод логирования.
 */
public abstract class PaymentProcessor {

    public abstract boolean process(long amount);

    public String log(long amount) {
        // TODO: реализуй
        return "Processing " + amount;
    }
}

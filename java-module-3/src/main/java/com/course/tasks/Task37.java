package com.course.tasks;

/**
 * UA: Простий калькулятор з операціями (без стану).
 * <p>
 * Вкладений enum {@link Operation}: ADD, SUB, MUL, DIV.
 * Без полів екземпляра; публічний конструктор без аргументів.
 * Метод {@link #calculate(double, double, Operation)} через switch:
 * <ul>
 *   <li>ADD → a + b</li>
 *   <li>SUB → a - b</li>
 *   <li>MUL → a * b</li>
 *   <li>DIV → a / b, але якщо b == 0 → ArithmeticException</li>
 * </ul>
 * Приклад: calculate(6, 3, DIV) == 2.0; calculate(1, 0, DIV) кидає ArithmeticException.
 * <p>
 * RU: Простой калькулятор с операциями (без состояния).
 * <p>
 * Вложенный enum {@link Operation}: ADD, SUB, MUL, DIV.
 * Без полей экземпляра; публичный конструктор без аргументов.
 * Метод {@link #calculate(double, double, Operation)} через switch:
 * <ul>
 *   <li>ADD → a + b</li>
 *   <li>SUB → a - b</li>
 *   <li>MUL → a * b</li>
 *   <li>DIV → a / b, но если b == 0 → ArithmeticException</li>
 * </ul>
 * Пример: calculate(6, 3, DIV) == 2.0; calculate(1, 0, DIV) бросает ArithmeticException.
 */
public class Task37 {

    /**
     * UA: Операції: ADD, SUB, MUL, DIV.
     * RU: Операции: ADD, SUB, MUL, DIV.
     */
    public enum Operation {
        ADD, SUB, MUL, DIV
    }

    /**
     * UA: Конструктор без аргументів (клас без стану).
     * RU: Конструктор без аргументов (класс без состояния).
     */
    public Task37() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Обчислює a op b (switch). DIV на нуль → ArithmeticException.
     * RU: Вычисляет a op b (switch). DIV на ноль → ArithmeticException.
     */
    public double calculate(double a, double b, Operation op) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public String toString() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}

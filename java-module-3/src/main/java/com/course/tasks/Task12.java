package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель лічильника (Counter).
 * <p>Поля:
 * <ul>
 *   <li>{@code value} — значення лічильника (змінюється методами), стартує з 0.</li>
 * </ul>
 * Конструктор без аргументів (value = 0).
 * Методи: {@code increment()} — value++; {@code decrement()} — value-- (не нижче 0, інакше IllegalArgumentException);
 * {@code reset()} — value = 0; {@code getValue()} — повертає значення.
 * toString має префікс "Counter" і містить значення.
 *
 * <p>RU: Модель счётчика (Counter).
 * <p>Поля:
 * <ul>
 *   <li>{@code value} — значение счётчика (изменяемое), стартует с 0.</li>
 * </ul>
 * Конструктор без аргументов (value = 0).
 * Методы: {@code increment()} — value++; {@code decrement()} — value-- (не ниже 0, иначе IllegalArgumentException);
 * {@code reset()} — value = 0; {@code getValue()} — возвращает значение.
 * toString имеет префикс "Counter" и содержит значение.
 *
 * <p>Приклад / Пример: new Task12() -&gt; "Counter{value=0}".
 */
public class Task12 {

    private int value;

    public Task12() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        if (value <= 0) {
            throw new IllegalArgumentException("");
        }
        value--;
    }

    public void reset() {
        value = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task12 that = (Task12) o;
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Counter{value=" + value + "}";
    }
}
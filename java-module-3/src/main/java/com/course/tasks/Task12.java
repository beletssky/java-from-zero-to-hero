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
        // TODO: реализуй
        this.value = 0;
    }

    public int getValue() {
        // TODO: реализуй
        return value;
    }

    public void increment() {
        // TODO: реализуй
        value++;
    }

    public void decrement() {
        // TODO: реализуй
        if (value == 0) {
            throw new IllegalArgumentException();
        }
        value--;
    }

    public void reset() {
        // TODO: реализуй
        value = 0;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task12 task12)) return false;
        return this.value == task12.value;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Counter" + value;
    }
}

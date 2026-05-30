package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель часу доби (Time24).
 * <p>Поля:
 * <ul>
 *   <li>{@code hours} — години (змінюване, 0..23).</li>
 *   <li>{@code minutes} — хвилини (змінюване, 0..59).</li>
 * </ul>
 * Валідація: hours 0..23, minutes 0..59 (у конструкторі та сетерах setHours/setMinutes), інакше IllegalArgumentException.
 * Метод {@code addMinutes(int m)} просуває час уперед, переходячи через північ за модулем
 * (m може бути великим; години лишаються в 0..23).
 * toString повертає "HH:MM" з провідними нулями, напр. "09:05".
 *
 * <p>RU: Модель времени суток (Time24).
 * <p>Поля:
 * <ul>
 *   <li>{@code hours} — часы (изменяемое, 0..23).</li>
 *   <li>{@code minutes} — минуты (изменяемое, 0..59).</li>
 * </ul>
 * Валидация: hours 0..23, minutes 0..59 (в конструкторе и сеттерах setHours/setMinutes), иначе IllegalArgumentException.
 * Метод {@code addMinutes(int m)} продвигает время вперёд, переходя через полночь по модулю
 * (m может быть большим; часы остаются в 0..23).
 * toString возвращает "HH:MM" с ведущими нулями, напр. "09:05".
 *
 * <p>Приклад / Пример: new Task16(9, 5).toString() -&gt; "09:05".
 */
public class Task16 {

    private int hours;
    private int minutes;

    public Task16(int hours, int minutes) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getHours() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getMinutes() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setHours(int hours) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setMinutes(int minutes) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void addMinutes(int m) {
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

    @Override
    public String toString() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}

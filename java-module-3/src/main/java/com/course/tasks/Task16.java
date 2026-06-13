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
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("");
        }
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("");
        }
        this.minutes = minutes;
    }

    public void addMinutes(int m) {
        int total = hours * 60 + minutes + m;
        total = total % (24 * 60);
        hours = total / 60;
        minutes = total % 60;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task16 that = (Task16) o;
        return this.hours == that.hours && this.minutes == that.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}
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
        validateHours(hours);
        validateMinutes(minutes);
        this.hours = hours;
        this.minutes = minutes;
    }

    private void validateHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("NOOOOO");
        }
    }

    private void validateMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("NOOOOO");
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        validateHours(hours);
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        validateMinutes(minutes);
        this.minutes = minutes;
    }

    public void addMinutes(int m) {
        int totalMinutes = (hours * 60) + minutes + m;
        int newMinutes = totalMinutes % 60;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        this.minutes = newMinutes;
        this.hours = newHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task16 task16 = (Task16) o;
        return hours == task16.hours && minutes == task16.minutes;
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

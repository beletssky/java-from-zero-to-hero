package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель дати (Date).
 * <p>Поля:
 * <ul>
 *   <li>{@code day} — день (змінюване).</li>
 *   <li>{@code month} — місяць (змінюване, 1..12).</li>
 *   <li>{@code year} — рік (змінюване, 1900..2100).</li>
 * </ul>
 * Валідація: month 1..12, year 1900..2100, day коректний для місяця з урахуванням високосних років
 * (приватний помічник {@code daysInMonth(int month, int year)}). Інакше IllegalArgumentException.
 * Сетери: setDay/setMonth/setYear з валідацією.
 * toString повертає "DD.MM.YYYY" з провідними нулями, напр. "05.03.2024".
 *
 * <p>RU: Модель даты (Date).
 * <p>Поля:
 * <ul>
 *   <li>{@code day} — день (изменяемое).</li>
 *   <li>{@code month} — месяц (изменяемое, 1..12).</li>
 *   <li>{@code year} — год (изменяемое, 1900..2100).</li>
 * </ul>
 * Валидация: month 1..12, year 1900..2100, day корректный для месяца с учётом високосных лет
 * (приватный помощник {@code daysInMonth(int month, int year)}). Иначе IllegalArgumentException.
 * Сеттеры: setDay/setMonth/setYear с валидацией.
 * toString возвращает "DD.MM.YYYY" с ведущими нулями, напр. "05.03.2024".
 *
 * <p>Приклад / Пример: new Task17(5, 3, 2024).toString() -&gt; "05.03.2024".
 */
public class Task17 {

    private int day;
    private int month;
    private int year;

    public Task17(int day, int month, int year) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getDay() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getMonth() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getYear() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setDay(int day) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setMonth(int month) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setYear(int year) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    private int daysInMonth(int month, int year) {
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

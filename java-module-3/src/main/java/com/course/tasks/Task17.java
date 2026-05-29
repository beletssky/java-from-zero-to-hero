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
        validate(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private void validate(int d, int m, int y) {
        if (y < 1900 || y > 2100) {
            throw new IllegalArgumentException();
        } else if (m < 1 || m > 12) {
            throw new IllegalArgumentException();
        }
        int maxDays = daysInMonth(m, y);
        if (d < 1 || d > maxDays) {
            throw new IllegalArgumentException();
        }
    }


    public int getDay() {
        // TODO: реализуй
        return day;
    }

    public int getMonth() {
        // TODO: реализуй
        return month;
    }

    public int getYear() {
        // TODO: реализуй
        return year;
    }

    public void setDay(int day) {
        // TODO: реализуй
        validate(day, this.month, this.year);
        this.day = day;
    }

    public void setMonth(int month) {
        // TODO: реализуй
        validate(this.day, month, this.year);
        this.month = month;
    }

    public void setYear(int year) {
        // TODO: реализуй
        validate(this.day, this.month, year);
        this.year = year;
    }

    private int daysInMonth(int month, int year) {
        // TODO: реализуй
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                boolean isLeap = (year % 4 == 0
                        && (year % 100 != 0 || year % 400 == 0));
                yield isLeap ? 29 : 28;
            }
            default -> 31;
        };
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task17 task17)) return false;
        return this.year == task17.year
                && this.month == task17.month
                && this.day == task17.day;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return String.format("%02d.%02d.%04d", day, month, year);
    }
}

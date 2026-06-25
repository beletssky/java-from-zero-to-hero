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
        validate(year, month, day);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private void validate(int year, int month, int day) {
        if (year < 1990 || year > 2100) {
            throw new IllegalArgumentException("NOOOOO");
        } else if (month < 1 || month > 12) {
            throw new IllegalArgumentException("NOOOOO");
        }
        int maxDays = daysInMonth(month, year);
        if (day < 1 || day > maxDays) {
            throw new IllegalArgumentException("NOOOOO");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        validate(year, month, day);
        this.day = day;
    }

    public void setMonth(int month) {
        validate(year, month, day);
        this.month = month;
    }

    public void setYear(int year) {
        validate(year, month, day);
        this.year = year;
    }

    private int daysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                yield isLeap ? 29 : 28;
            }
            default -> throw new IllegalArgumentException("NOOOOO");
        };

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task17 task17 = (Task17) o;
        return day == task17.day && month == task17.month && year == task17.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%04d", day, month, year);
    }
}

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
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("");
        }
        if (year < 1900 || year > 2100) {
            throw new IllegalArgumentException("");
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            throw new IllegalArgumentException("");
        }
        this.day = day;
        this.month = month;
        this.year = year;
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
        if (day < 1 || day > daysInMonth(month, year)) {
            throw new IllegalArgumentException("");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("");
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2100) {
            throw new IllegalArgumentException("");
        }
        this.year = year;
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 2: return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task17 that = (Task17) o;
        return this.day == that.day && this.month == that.month && this.year == that.year;
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
package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює номер телефону.
 * Поле: number (String, незмінне). Валідація: рівно 10 цифр (кожен символ перевіряється
 * через Character.isDigit у циклі), інакше IllegalArgumentException. Сеттерів немає.
 * Методи: getNumber(), format() — повертає рядок у форматі "(XXX) XXX-XX-XX".
 * Формат toString містить префікс "PhoneNumber" та значення number.
 * Приклад: number "0501234567" -> format() = "(050) 123-45-67".
 * <p>
 * RU: Моделирует номер телефона.
 * Поле: number (String, неизменяемое). Валидация: ровно 10 цифр (каждый символ проверяется
 * через Character.isDigit в цикле), иначе IllegalArgumentException. Сеттеров нет.
 * Методы: getNumber(), format() — возвращает строку в формате "(XXX) XXX-XX-XX".
 * Формат toString содержит префикс "PhoneNumber" и значение number.
 * Пример: number "0501234567" -> format() = "(050) 123-45-67".
 */
public class Task08 {

    private final String number;

    public Task08(String number) {
        // TODO: реализуй
        validateNumber(number);
        this.number = number;
    }

    private void validateNumber(String s) {
        if (s.length() != 10) {
            throw new IllegalArgumentException();
        }
        char[] num = s.toCharArray();
        for (char x : num) {
            if (!Character.isDigit(x)) {
                throw new IllegalArgumentException();
            }
        }
    }

    public String getNumber() {
        // TODO: реализуй
        return number;
    }

    public String format() {
        // TODO: реализуй
        return number.replaceFirst("(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "($1) $2-$3-$4");
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task08 task08)) return false;
        return Objects.equals(this.number, task08.number);
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "PhoneNumber " + number;
    }
}

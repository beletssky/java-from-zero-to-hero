package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює номер телефону.
 *     Поле: number (String, незмінне). Валідація: рівно 10 цифр (кожен символ перевіряється
 *     через Character.isDigit у циклі), інакше IllegalArgumentException. Сеттерів немає.
 *     Методи: getNumber(), format() — повертає рядок у форматі "(XXX) XXX-XX-XX".
 *     Формат toString містить префікс "PhoneNumber" та значення number.
 *     Приклад: number "0501234567" -> format() = "(050) 123-45-67".
 *
 * RU: Моделирует номер телефона.
 *     Поле: number (String, неизменяемое). Валидация: ровно 10 цифр (каждый символ проверяется
 *     через Character.isDigit в цикле), иначе IllegalArgumentException. Сеттеров нет.
 *     Методы: getNumber(), format() — возвращает строку в формате "(XXX) XXX-XX-XX".
 *     Формат toString содержит префикс "PhoneNumber" и значение number.
 *     Пример: number "0501234567" -> format() = "(050) 123-45-67".
 */
public class Task08 {

    private final String number;

    public Task08(String number) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getNumber() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String format() {
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

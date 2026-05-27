package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює адресу електронної пошти.
 *     Поле: address (String, незмінне). Валідація: address != null, містить "@" та містить ".",
 *     інакше IllegalArgumentException. Сеттерів немає.
 *     Методи: getAddress(), getDomain() — повертає підрядок після символу "@".
 *     Формат toString містить префікс "Email" та значення address.
 *     Приклад: "user@example.com".getDomain() -> "example.com".
 *
 * RU: Моделирует адрес электронной почты.
 *     Поле: address (String, неизменяемое). Валидация: address != null, содержит "@" и содержит ".",
 *     иначе IllegalArgumentException. Сеттеров нет.
 *     Методы: getAddress(), getDomain() — возвращает подстроку после символа "@".
 *     Формат toString содержит префикс "Email" и значение address.
 *     Пример: getDomain() для "user@example.com" -> "example.com".
 */
public class Task07 {

    private final String address;

    public Task07(String address) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getAddress() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getDomain() {
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

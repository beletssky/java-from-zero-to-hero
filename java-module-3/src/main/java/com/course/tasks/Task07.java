package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює адресу електронної пошти.
 * Поле: address (String, незмінне). Валідація: address != null, містить "@" та містить ".",
 * інакше IllegalArgumentException. Сеттерів немає.
 * Методи: getAddress(), getDomain() — повертає підрядок після символу "@".
 * Формат toString містить префікс "Email" та значення address.
 * Приклад: "user@example.com".getDomain() -> "example.com".
 * <p>
 * RU: Моделирует адрес электронной почты.
 * Поле: address (String, неизменяемое). Валидация: address != null, содержит "@" и содержит ".",
 * иначе IllegalArgumentException. Сеттеров нет.
 * Методы: getAddress(), getDomain() — возвращает подстроку после символа "@".
 * Формат toString содержит префикс "Email" и значение address.
 * Пример: getDomain() для "user@example.com" -> "example.com".
 */
public class Task07 {

    private final String address;

    public Task07(String address) {
        // TODO: реализуй
        if (address == null || !address.contains("@") || !address.contains(".")) {
            throw new IllegalArgumentException();
        }
        this.address = address;
    }

    public String getAddress() {
        // TODO: реализуй
        return address;
    }

    public String getDomain() {
        // TODO: реализуй
        return address.substring(address.indexOf("@") + 1);
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task07 task07)) return false;
        return Objects.equals(this.address, task07.address);
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Email " + address;
    }
}

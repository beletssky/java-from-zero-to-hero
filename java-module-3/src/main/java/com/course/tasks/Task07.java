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
        if (address == null) {
            throw new IllegalArgumentException("Кола зиро");
        }
        if (!address.contains("@")) {
            throw new IllegalArgumentException("ты собака");
        }
        if (!address.contains(".")) {
            throw new IllegalArgumentException("точка для штаточка");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getDomain() {
        return address.substring(address.indexOf("@") + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task07 that = (Task07) o;
        return this.address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "Email{address = " + address + "}";
    }
}
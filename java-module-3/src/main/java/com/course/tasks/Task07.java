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
        if (address == null){
            throw new IllegalArgumentException();
        }
        if (!(address.contains("@") && address.contains("."))){
            throw new IllegalArgumentException();
        }

        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getDomain() {
        String[] domain = address.split("@");
        return domain[1];
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (!(o instanceof Task07)){
            return false;
        }
        if (this == o){
            return true;
        }
        return address.equals(getAddress());

    }

    @Override
    public int hashCode() {
        int a = Objects.hashCode(this.getAddress());
        int b = Objects.hashCode(this.getDomain());
        return a + b;
    }

    @Override
    public String toString() {
        return "Email " + address;
    }
}

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
        if (number == null || number.length() !=10){
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < number.length(); i++){
            if(!Character.isDigit(number.charAt(i))){
                throw new IllegalArgumentException();
            }
        }
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String format() {
        String format = "(" + number.substring(0,3) + ") " + number.substring(3, 6) + "-" + number.substring(6, 8) + "-" + number.substring(8,10);
        return format;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (!(o instanceof Task08)){
            return false;
        }
        if (this == o) {
            return true;
        }
        return number.equals(getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.number);
    }

    @Override
    public String toString() {
        return "PhoneNumber" + format();
    }
}

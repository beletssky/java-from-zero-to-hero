package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює міжнародний книжковий номер ISBN.
 * <ul>
 *   <li>Поле: {@code value} — {@code String}, незмінне (final).</li>
 *   <li>Валідація: рівно 13 символів, кожен з яких цифра ({@link Character#isDigit(char)} та довжина 13), інакше {@link IllegalArgumentException}.</li>
 *   <li>Методи: гетер {@link #getValue()}.</li>
 *   <li>equals/hashCode: ТІЛЬКИ за полем {@code value}.</li>
 *   <li>toString: префікс "ISBN" зі значенням.</li>
 *   <li>Приклад: {@code new Task23("9781234567897")} -> "ISBN{value='9781234567897'}".</li>
 * </ul>
 *
 * RU: Класс моделирует международный книжный номер ISBN.
 * <ul>
 *   <li>Поле: {@code value} — {@code String}, неизменяемое (final).</li>
 *   <li>Валидация: ровно 13 символов, каждый из которых цифра ({@link Character#isDigit(char)} и длина 13), иначе {@link IllegalArgumentException}.</li>
 *   <li>Методы: геттер {@link #getValue()}.</li>
 *   <li>equals/hashCode: ТОЛЬКО по полю {@code value}.</li>
 *   <li>toString: префикс "ISBN" со значением.</li>
 *   <li>Пример: {@code new Task23("9781234567897")} -> "ISBN{value='9781234567897'}".</li>
 * </ul>
 */
public class Task23 {

    private final String value;

    public Task23(String value) {
        if (value == null || value.length() != 13) {
            throw new IllegalArgumentException("NOOOOO");
        }
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                throw new IllegalArgumentException("NOOOOO");
            }
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task23 task23 = (Task23) o;
        return Objects.equals(value, task23.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ISBN{" + value + "}";
    }
}

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
 * <p>
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
        // TODO: реализуй
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        if (value == null) {
            throw new IllegalArgumentException();
        } else if (!(value.length() == 13)) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < value.length(); i++) {
            char currentChar = value.charAt(i);
            if (!Character.isDigit(currentChar)) {
                throw new IllegalArgumentException();
            }
        }
    }

    public String getValue() {
        // TODO: реализуй
        return value;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task23 task23)) return false;
        return this.value.equals(task23.value);
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "ISBN{value=" + value + "}";
    }
}

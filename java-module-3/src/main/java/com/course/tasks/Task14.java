package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель користувача (User).
 * <p>Поля:
 * <ul>
 *   <li>{@code username} — ім'я користувача (незмінне, final).</li>
 *   <li>{@code email} — електронна пошта (змінюване).</li>
 *   <li>{@code age} — вік (змінюване).</li>
 * </ul>
 * Валідація: username довжиною 3..20 і лише літери/цифри (Character.isLetterOrDigit);
 * email містить "@"; age 0..150. Інакше IllegalArgumentException.
 * Сетери: {@code setEmail(String)} (містить "@"); {@code setAge(int)} (0..150).
 * toString має префікс "User" і містить поля.
 *
 * <p>RU: Модель пользователя (User).
 * <p>Поля:
 * <ul>
 *   <li>{@code username} — имя пользователя (неизменяемое, final).</li>
 *   <li>{@code email} — электронная почта (изменяемое).</li>
 *   <li>{@code age} — возраст (изменяемое).</li>
 * </ul>
 * Валидация: username длиной 3..20 и только буквы/цифры (Character.isLetterOrDigit);
 * email содержит "@"; age 0..150. Иначе IllegalArgumentException.
 * Сеттеры: {@code setEmail(String)} (содержит "@"); {@code setAge(int)} (0..150).
 * toString имеет префикс "User" и содержит поля.
 *
 * <p>Приклад / Пример: new Task14("ivan42", "a@b.com", 30).
 */
public class Task14 {

    private final String username;
    private String email;
    private int age;

    public Task14(String username, String email, int age) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getUsername() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getEmail() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getAge() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setEmail(String email) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setAge(int age) {
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

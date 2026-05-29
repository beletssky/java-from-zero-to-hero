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
        validateUsername(username);
        validateEmail(email);
        this.username = username;
        this.email = email;
        this.age = age;
    }

    private void validateUsername(String name) {
        if (name == null || name.length() < 3 || name.length() > 20) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException();
        }
    }

    private void validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException();
        }
    }


    public String getUsername() {
        // TODO: реализуй
        return username;
    }

    public String getEmail() {
        // TODO: реализуй
        return email;
    }

    public int getAge() {
        // TODO: реализуй
        return age;
    }

    public void setEmail(String email) {
        // TODO: реализуй
        validateEmail(email);
        this.email = email;
    }

    public void setAge(int age) {
        // TODO: реализуй
        validateAge(age);
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task14 task14)) return false;
        return Objects.equals(this.email, task14.email)
                && Objects.equals(this.username, task14.username)
                && this.age == task14.age;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(username, email, age);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "User" + username + email + age;
    }
}

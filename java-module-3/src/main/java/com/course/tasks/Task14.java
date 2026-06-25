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
        validateUsername(username);
        this.username = username;
        setEmail(email);
        setAge(age);
    }

    private void validateUsername(String username) {
        if (username.length() < 3 || username.length() > 20) {
            throw new IllegalArgumentException("NOOOOO");
        }
        for (int i = 0; i < username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i))) {
                throw new IllegalArgumentException("NOOOOO");
            }
        }
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("NOOOOO");
        }
        this.email = email;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("NOOOOO");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task14 task14 = (Task14) o;
        return Objects.equals(username, task14.username) && Objects.equals(email, task14.email) && age == task14.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, age);
    }

    @Override
    public String toString() {
        return "User{" + username + ", " + email + ", " + age + "}";
    }
}

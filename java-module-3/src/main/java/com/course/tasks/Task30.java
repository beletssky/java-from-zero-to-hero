package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює фільм (Movie).
 * <ul>
 *   <li>Поля: {@code title} ({@code String}), {@code year} ({@code int}), {@code rating} ({@code double}),
 *       {@code durationMinutes} ({@code int}) — всі незмінні (final).</li>
 *   <li>Валідація: rating у межах 0.0..10.0; year у межах 1900..2100; durationMinutes > 0; інакше {@link IllegalArgumentException}.</li>
 *   <li>Методи: гетери {@link #getTitle()}, {@link #getYear()}, {@link #getRating()}, {@link #getDurationMinutes()}.</li>
 *   <li>equals/hashCode: за всіма чотирма полями.</li>
 *   <li>toString: "Movie{title='X', year=Y, rating=Z}" — лише title, year, rating.</li>
 *   <li>Приклад: {@code new Task30("Matrix", 1999, 8.7, 136)} -> "Movie{title='Matrix', year=1999, rating=8.7}".</li>
 * </ul>
 *
 * RU: Класс моделирует фильм (Movie).
 * <ul>
 *   <li>Поля: {@code title} ({@code String}), {@code year} ({@code int}), {@code rating} ({@code double}),
 *       {@code durationMinutes} ({@code int}) — все неизменяемые (final).</li>
 *   <li>Валидация: rating в пределах 0.0..10.0; year в пределах 1900..2100; durationMinutes > 0; иначе {@link IllegalArgumentException}.</li>
 *   <li>Методы: геттеры {@link #getTitle()}, {@link #getYear()}, {@link #getRating()}, {@link #getDurationMinutes()}.</li>
 *   <li>equals/hashCode: по всем четырём полям.</li>
 *   <li>toString: "Movie{title='X', year=Y, rating=Z}" — только title, year, rating.</li>
 *   <li>Пример: {@code new Task30("Matrix", 1999, 8.7, 136)} -> "Movie{title='Matrix', year=1999, rating=8.7}".</li>
 * </ul>
 */
public class Task30 {

    private final String title;
    private final int year;
    private final double rating;
    private final int durationMinutes;

    public Task30(String title, int year, double rating, int durationMinutes) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getTitle() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getYear() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getRating() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getDurationMinutes() {
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

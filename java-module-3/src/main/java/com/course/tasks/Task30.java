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
        if (rating < 0.0 || rating > 10.0) {
            throw new IllegalArgumentException("");
        }
        if (year < 1900 || year > 2100) {
            throw new IllegalArgumentException("");
        }
        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("");
        }
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task30 that = (Task30) o;
        return this.title.equals(that.title) && this.year == that.year && this.rating == that.rating && this.durationMinutes == that.durationMinutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, rating, durationMinutes);
    }

    @Override
    public String toString() {
        return "Movie{title='" + title + "', year=" + year + ", rating=" + rating + "}";
    }
}

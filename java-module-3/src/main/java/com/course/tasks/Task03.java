package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює книгу.
 * Поля: title (String, незмінне), author (String, незмінне), year (int, незмінне).
 * Валідація: title та author не повинні бути null або порожніми після trim,
 * інакше IllegalArgumentException. Сеттерів немає.
 * Методи: getTitle(), getAuthor(), getYear().
 * Формат toString містить префікс "Book" та значення полів.
 * <p>
 * RU: Моделирует книгу.
 * Поля: title (String, неизменяемое), author (String, неизменяемое), year (int, неизменяемое).
 * Валидация: title и author не должны быть null или пустыми после trim,
 * иначе IllegalArgumentException. Сеттеров нет.
 * Методы: getTitle(), getAuthor(), getYear().
 * Формат toString содержит префикс "Book" и значения полей.
 */
public class Task03 {

    private final String title;
    private final String author;
    private final int year;

    public Task03(String title, String author, int year) {
        if (title == null) {
            throw new IllegalArgumentException("");
        }
        if (title.trim().isEmpty()) {
            throw new IllegalArgumentException("");
        }
        if (author == null) {
            throw new IllegalArgumentException("");
        }
        if (author.trim().isEmpty()) {
            throw new IllegalArgumentException("");
        }
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task03 that = (Task03) o;
        return this.title.equals(that.title) && this.author.equals(that.author) && this.year == (that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return "Book{title=" + title + ", author=" + author + ", year=" + year + "}";
    }
}
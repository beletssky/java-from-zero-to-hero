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
        // TODO: реализуй
        validateBook(title);
        validateBook(author);
        this.title = title;
        this.author = author;
        this.year = year;
    }

    private void validateBook(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public String getTitle() {
        // TODO: реализуй
        return title;
    }

    public String getAuthor() {
        // TODO: реализуй
        return author;
    }

    public int getYear() {
        // TODO: реализуй
        return year;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task03 task03)) return false;

        return Objects.equals(title, task03.title)
                && Objects.equals(author, task03.author)
                && this.year == task03.year;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Book " + title + " " + author + " " + year;
    }
}

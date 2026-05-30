package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює книгу.
 *     Поля: title (String, незмінне), author (String, незмінне), year (int, незмінне).
 *     Валідація: title та author не повинні бути null або порожніми після trim,
 *     інакше IllegalArgumentException. Сеттерів немає.
 *     Методи: getTitle(), getAuthor(), getYear().
 *     Формат toString містить префікс "Book" та значення полів.
 *
 * RU: Моделирует книгу.
 *     Поля: title (String, неизменяемое), author (String, неизменяемое), year (int, неизменяемое).
 *     Валидация: title и author не должны быть null или пустыми после trim,
 *     иначе IllegalArgumentException. Сеттеров нет.
 *     Методы: getTitle(), getAuthor(), getYear().
 *     Формат toString содержит префикс "Book" и значения полей.
 */
public class Task03 {

    private final String title;
    private final String author;
    private final int year;

    public Task03(String title, String author, int year) {
        if (author == null || title == null){
            throw new IllegalArgumentException();
        }
        this.title = title.trim();
        this.author = author.trim();
        this.year = year;

        if (author.isBlank() || title.isBlank()){
            throw new IllegalArgumentException();
        }
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
        if (o == null){
            return false;
        }
        if (!(o instanceof Task03)){
            return false;
        }
        if (this == o){
            return true;
        }
        boolean isFirstParamSame = title.equals(getTitle());
        boolean isSecondParamSame = author.equals(getAuthor());
        boolean isThirdParamSame = year == ((Task03) o).getYear();

        return isFirstParamSame && isSecondParamSame && isThirdParamSame;
    }

    @Override
    public int hashCode() {
        return year * 7;
    }

    @Override
    public String toString() {
        return "Book " + title + author + year;
    }
}

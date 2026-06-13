package com.course.task07;

/**
 * Книга с названием и автором.
 * Базовый класс для печатных и электронных изданий.
 */
public class Book {

    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getInfo() {
        return title + " by " + author;
    }
}

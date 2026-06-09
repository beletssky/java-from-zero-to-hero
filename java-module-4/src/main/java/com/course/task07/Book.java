package com.course.task07;

/**
 * Книга с названием и автором.
 * Базовый класс для печатных и электронных изданий.
 */
public class Book {

    protected String title;
    protected String author;

    public Book(String title, String author) {
        // TODO: реализуй
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        // TODO: реализуй
        return this.title;
    }

    public String getAuthor() {
        // TODO: реализуй
        return this.author;
    }

    public String getInfo() {
        // TODO: реализуй
        return title + " by " + author;
    }
}

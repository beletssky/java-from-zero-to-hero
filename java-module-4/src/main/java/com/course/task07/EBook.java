package com.course.task07;

/**
 * Электронная книга — подкласс Book.
 * Дополнительно содержит размер файла в мегабайтах.
 */
public class EBook extends Book {

    private long sizeMb;

    public EBook(String title, String author, long sizeMb) {
        super(title, author);
        // TODO: реализуй
        this.sizeMb = sizeMb;
    }

    public long getSizeMb() {
        // TODO: реализуй
        return this.sizeMb;
    }

    @Override
    public String getInfo() {
        // TODO: реализуй
        return title + " by " + author + " (" + sizeMb + " MB)";
    }
}

package com.course.task07;

/**
 * Электронная книга — подкласс Book.
 * Дополнительно содержит размер файла в мегабайтах.
 */
public class EBook extends Book {

    private long sizeMb;

    public EBook(String title, String author, long sizeMb) {
        super(title, author);
        this.sizeMb = sizeMb;
    }

    public long getSizeMb() {
        return sizeMb;
    }

    @Override
    public String getInfo() {
        return title + " by " + author + " (" + sizeMb + " MB)";
    }
}

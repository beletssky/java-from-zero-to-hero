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
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public long getSizeMb() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public String getInfo() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}

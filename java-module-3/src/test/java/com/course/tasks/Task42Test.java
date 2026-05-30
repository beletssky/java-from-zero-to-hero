package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task42Test {

    @Test
    void addBookThenFindByAuthorReturnsIt() {
        Task42 lib = new Task42();
        lib.addBook(new Task42.Book("Clean Code", "Martin"));
        lib.addBook(new Task42.Book("Refactoring", "Fowler"));
        Task42.Book[] byMartin = lib.findByAuthor("Martin");
        assertEquals(1, byMartin.length);
        assertEquals("Clean Code", byMartin[0].getTitle());
    }

    @Test
    void findByAuthorReturnsMultiple() {
        Task42 lib = new Task42();
        lib.addBook(new Task42.Book("Clean Code", "Martin"));
        lib.addBook(new Task42.Book("Clean Architecture", "Martin"));
        Task42.Book[] byMartin = lib.findByAuthor("Martin");
        assertEquals(2, byMartin.length);
    }

    @Test
    void findByAuthorUnknownIsEmpty() {
        Task42 lib = new Task42();
        lib.addBook(new Task42.Book("Clean Code", "Martin"));
        assertEquals(0, lib.findByAuthor("Nobody").length);
    }

    @Test
    void newBookIsAvailable() {
        Task42.Book book = new Task42.Book("Clean Code", "Martin");
        assertTrue(book.isAvailable());
    }

    @Test
    void borrowBookMakesUnavailable() {
        Task42 lib = new Task42();
        lib.addBook(new Task42.Book("Clean Code", "Martin"));
        assertTrue(lib.borrowBook("Clean Code"));
        assertFalse(lib.findByAuthor("Martin")[0].isAvailable());
    }

    @Test
    void borrowAlreadyBorrowedReturnsFalse() {
        Task42 lib = new Task42();
        lib.addBook(new Task42.Book("Clean Code", "Martin"));
        assertTrue(lib.borrowBook("Clean Code"));
        assertFalse(lib.borrowBook("Clean Code"));
    }

    @Test
    void borrowUnknownTitleReturnsFalse() {
        Task42 lib = new Task42();
        lib.addBook(new Task42.Book("Clean Code", "Martin"));
        assertFalse(lib.borrowBook("Unknown"));
    }

    @Test
    void returnBookRestoresAvailability() {
        Task42 lib = new Task42();
        lib.addBook(new Task42.Book("Clean Code", "Martin"));
        lib.borrowBook("Clean Code");
        assertTrue(lib.returnBook("Clean Code"));
        assertTrue(lib.findByAuthor("Martin")[0].isAvailable());
    }

    @Test
    void getBooksReturnsCopy() {
        Task42 lib = new Task42();
        lib.addBook(new Task42.Book("Clean Code", "Martin"));
        Task42.Book[] first = lib.getBooks();
        first[0] = null;
        assertNotNull(lib.getBooks()[0]);
    }

    @Test
    void bookEqualsAndHashCode() {
        Task42.Book a = new Task42.Book("Clean Code", "Martin");
        Task42.Book b = new Task42.Book("Clean Code", "Martin");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void libraryToStringHasPrefix() {
        Task42 lib = new Task42();
        assertTrue(lib.toString().startsWith("Library"));
    }

    @Test
    void bookGetters() {
        Task42.Book a = new Task42.Book("Clean Code", "Martin");
        assertEquals("Clean Code", a.getTitle());
        assertEquals("Martin", a.getAuthor());
        assertNotNull(a.toString());
    }
}

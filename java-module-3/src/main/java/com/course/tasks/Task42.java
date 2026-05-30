package com.course.tasks;

import java.util.Arrays;
import java.util.Objects;

/**
 * UA: Бібліотека (Library).
 * <p>
 * Вкладений клас {@link Book} описує книгу: назву ({@code title}), автора
 * ({@code author}) та ознаку доступності ({@code available}). Поля {@code title}
 * та {@code author} приватні незмінні (final); {@code available} — приватне
 * boolean-поле з геттером {@code isAvailable()} (на старті {@code true}).
 * Є конструктор {@code Book(title, author)}, геттери {@code getTitle/getAuthor/isAvailable},
 * перевизначені {@code toString/equals/hashCode}.
 * <p>
 * Бібліотека зберігає книги у приватному масиві {@code books}, спочатку порожньому.
 * Методи:
 * <ul>
 *   <li>{@code void addBook(Book book)} — додає книгу в кінець.</li>
 *   <li>{@code boolean borrowBook(String title)} — знайти за назвою; якщо знайдено
 *       та доступна → зробити недоступною і повернути {@code true}; інакше {@code false}.</li>
 *   <li>{@code boolean returnBook(String title)} — знайти за назвою; зробити доступною,
 *       повернути {@code true}; інакше {@code false}.</li>
 *   <li>{@code Book[] findByAuthor(String author)} — масив книг цього автора.</li>
 * </ul>
 *
 * <hr>
 * RU: Библиотека (Library).
 * <p>
 * Вложенный класс {@link Book} описывает книгу: название ({@code title}), автора
 * ({@code author}) и признак доступности ({@code available}). Поля {@code title}
 * и {@code author} приватные неизменяемые (final); {@code available} — приватное
 * boolean-поле с геттером {@code isAvailable()} (на старте {@code true}).
 * Есть конструктор {@code Book(title, author)}, геттеры {@code getTitle/getAuthor/isAvailable},
 * переопределённые {@code toString/equals/hashCode}.
 * <p>
 * Библиотека хранит книги в приватном массиве {@code books}, изначально пустом.
 * Методы:
 * <ul>
 *   <li>{@code void addBook(Book book)} — добавляет книгу в конец.</li>
 *   <li>{@code boolean borrowBook(String title)} — найти по названию; если найдена
 *       и доступна → сделать недоступной и вернуть {@code true}; иначе {@code false}.</li>
 *   <li>{@code boolean returnBook(String title)} — найти по названию; сделать доступной,
 *       вернуть {@code true}; иначе {@code false}.</li>
 *   <li>{@code Book[] findByAuthor(String author)} — массив книг этого автора.</li>
 * </ul>
 */
public class Task42 {

    /**
     * UA: Книга: назва, автор, ознака доступності. title/author незмінні (final),
     * available на старті true.
     * <p>
     * RU: Книга: название, автор, признак доступности. title/author неизменяемые (final),
     * available на старте true.
     */
    public static class Book {
        private final String title;
        private final String author;
        private boolean available;

        /**
         * UA: Створює книгу; available = true.
         * RU: Создаёт книгу; available = true.
         *
         * @param title  UA: назва / RU: название
         * @param author UA: автор / RU: автор
         */
        public Book(String title, String author) {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /** UA: назва. RU: название. */
        public String getTitle() {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /** UA: автор. RU: автор. */
        public String getAuthor() {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /** UA: чи доступна книга. RU: доступна ли книга. */
        public boolean isAvailable() {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /**
         * UA: Пакетний доступ для зміни ознаки доступності.
         * RU: Пакетный доступ для изменения признака доступности.
         */
        void setAvailable(boolean available) {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        @Override
        public String toString() {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        @Override
        public boolean equals(Object o) {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        @Override
        public int hashCode() {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }
    }

    private Book[] books;

    /**
     * UA: Створює порожню бібліотеку (books довжиною 0).
     * RU: Создаёт пустую библиотеку (books длиной 0).
     */
    public Task42() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Приватний помічник: копія масиву, збільшена на один елемент.
     * RU: Приватный помощник: копия массива, увеличенная на один элемент.
     */
    private Book[] cloneAndExtend(Book[] source) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Додає книгу в кінець.
     * RU: Добавляет книгу в конец.
     */
    public void addBook(Book book) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Позичити: знайти за назвою; якщо доступна → недоступна, true; інакше false.
     * RU: Взять: найти по названию; если доступна → недоступна, true; иначе false.
     */
    public boolean borrowBook(String title) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повернути: знайти за назвою; зробити доступною, true; інакше false.
     * RU: Вернуть: найти по названию; сделать доступной, true; иначе false.
     */
    public boolean returnBook(String title) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає масив книг указаного автора.
     * RU: Возвращает массив книг указанного автора.
     */
    public Book[] findByAuthor(String author) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає КОПІЮ масиву книг.
     * RU: Возвращает КОПИЮ массива книг.
     */
    public Book[] getBooks() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public String toString() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}

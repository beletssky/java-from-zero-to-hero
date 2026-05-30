package com.course.tasks;

import java.util.Arrays;
import java.util.Objects;

/**
 * UA: Журнал подій (EventLog).
 * <p>
 * Вкладений клас {@link Event} описує подію: мітку часу ({@code timestamp}) та
 * повідомлення ({@code message}). Поля приватні незмінні (final), є конструктор
 * {@code Event(timestamp, message)}, геттери {@code getTimestamp/getMessage},
 * перевизначені {@code toString/equals/hashCode}.
 * <p>
 * Журнал зберігає події у приватному масиві {@code events}, спочатку порожньому.
 * Методи:
 * <ul>
 *   <li>{@code void add(String message)} — створює {@code Event} з
 *       {@code System.currentTimeMillis()} і повідомленням, додає в кінець.</li>
 *   <li>{@code Event[] filterByText(String substring)} — події, чиє повідомлення
 *       містить підрядок.</li>
 *   <li>{@code int count()} — кількість подій.</li>
 * </ul>
 *
 * <hr>
 * RU: Журнал событий (EventLog).
 * <p>
 * Вложенный класс {@link Event} описывает событие: метку времени ({@code timestamp})
 * и сообщение ({@code message}). Поля приватные неизменяемые (final), есть
 * конструктор {@code Event(timestamp, message)}, геттеры {@code getTimestamp/getMessage},
 * переопределённые {@code toString/equals/hashCode}.
 * <p>
 * Журнал хранит события в приватном массиве {@code events}, изначально пустом.
 * Методы:
 * <ul>
 *   <li>{@code void add(String message)} — создаёт {@code Event} с
 *       {@code System.currentTimeMillis()} и сообщением, добавляет в конец.</li>
 *   <li>{@code Event[] filterByText(String substring)} — события, чьё сообщение
 *       содержит подстроку.</li>
 *   <li>{@code int count()} — количество событий.</li>
 * </ul>
 */
public class Task45 {

    /**
     * UA: Подія: мітка часу та повідомлення. Поля приватні незмінні (final).
     * RU: Событие: метка времени и сообщение. Поля приватные неизменяемые (final).
     */
    public static class Event {
        private final long timestamp;
        private final String message;

        /**
         * UA: Створює подію.
         * RU: Создаёт событие.
         *
         * @param timestamp UA: мітка часу / RU: метка времени
         * @param message   UA: повідомлення / RU: сообщение
         */
        public Event(long timestamp, String message) {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /** UA: мітка часу. RU: метка времени. */
        public long getTimestamp() {
            // TODO: реализуй
            throw new UnsupportedOperationException("TODO: реализуй");
        }

        /** UA: повідомлення. RU: сообщение. */
        public String getMessage() {
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

    private Event[] events;

    /**
     * UA: Створює порожній журнал (events довжиною 0).
     * RU: Создаёт пустой журнал (events длиной 0).
     */
    public Task45() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Приватний помічник: копія масиву, збільшена на один елемент.
     * RU: Приватный помощник: копия массива, увеличенная на один элемент.
     */
    private Event[] cloneAndExtend(Event[] source) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Створює Event з поточним часом і повідомленням, додає в кінець.
     * RU: Создаёт Event с текущим временем и сообщением, добавляет в конец.
     */
    public void add(String message) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає події, чиє повідомлення містить підрядок.
     * RU: Возвращает события, чьё сообщение содержит подстроку.
     */
    public Event[] filterByText(String substring) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Кількість подій.
     * RU: Количество событий.
     */
    public int count() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає КОПІЮ масиву подій.
     * RU: Возвращает КОПИЮ массива событий.
     */
    public Event[] getEvents() {
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

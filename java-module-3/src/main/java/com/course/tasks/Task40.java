package com.course.tasks;

import java.util.Arrays;

/**
 * UA: Рука з 5 карт (Hand).
 * <p>
 * Вкладений enum {@link Suit}: HEARTS, DIAMONDS, CLUBS, SPADES.
 * Поле {@code cards} — незмінне (final) масив рівно з 5 елементів.
 * Конструктор валідовує: довжина == 5 та жоден елемент не null, інакше IllegalArgumentException;
 * зберігає захисну копію.
 * Метод {@link #isFlush()} — true якщо всі 5 карт однієї масті (цикл порівняння з cards[0]).
 * Геттер {@link #getCards()} повертає копію масиву.
 * equals/hashCode за вмістом масиву (Arrays.equals / Arrays.hashCode).
 * Приклад: 5 карт HEARTS → isFlush() == true.
 * <p>
 * RU: Рука из 5 карт (Hand).
 * <p>
 * Вложенный enum {@link Suit}: HEARTS, DIAMONDS, CLUBS, SPADES.
 * Поле {@code cards} — неизменяемое (final) массив ровно из 5 элементов.
 * Конструктор валидирует: длина == 5 и ни один элемент не null, иначе IllegalArgumentException;
 * хранит защитную копию.
 * Метод {@link #isFlush()} — true если все 5 карт одной масти (цикл сравнения с cards[0]).
 * Геттер {@link #getCards()} возвращает копию массива.
 * equals/hashCode по содержимому массива (Arrays.equals / Arrays.hashCode).
 * Пример: 5 карт HEARTS → isFlush() == true.
 */
public class Task40 {

    /**
     * UA: Масті: HEARTS, DIAMONDS, CLUBS, SPADES.
     * RU: Масти: HEARTS, DIAMONDS, CLUBS, SPADES.
     */
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    /**
     * UA: Карти руки (незмінне поле, рівно 5 елементів, захисна копія).
     * RU: Карты руки (неизменяемое поле, ровно 5 элементов, защитная копия).
     */
    private final Suit[] cards;

    /**
     * UA: Конструктор — валідовує довжину == 5 та відсутність null; зберігає захисну копію.
     * RU: Конструктор — валидирует длину == 5 и отсутствие null; хранит защитную копию.
     */
    public Task40(Suit[] cards) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер карт — повертає копію масиву.
     * RU: Геттер карт — возвращает копию массива.
     */
    public Suit[] getCards() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: true якщо всі 5 карт однієї масті (цикл порівняння з cards[0]).
     * RU: true если все 5 карт одной масти (цикл сравнения с cards[0]).
     */
    public boolean isFlush() {
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

package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює гральну карту (Card).
 * <ul>
 *   <li>Поля: {@code rank} ({@code int}, 2..14, де 11=J, 12=Q, 13=K, 14=A) та {@code suit} ({@code String}) — незмінні (final).</li>
 *   <li>Валідація: rank у межах 2..14; suit належить множині {"hearts", "diamonds", "clubs", "spades"}; інакше {@link IllegalArgumentException}.</li>
 *   <li>Методи: гетери {@link #getRank()}, {@link #getSuit()}.</li>
 *   <li>equals/hashCode: за rank + suit.</li>
 *   <li>toString: формат "rank of suit" з ЧИСЛОВИМ rank, напр. "10 of hearts", "14 of spades".</li>
 * </ul>
 *
 * RU: Класс моделирует игральную карту (Card).
 * <ul>
 *   <li>Поля: {@code rank} ({@code int}, 2..14, где 11=J, 12=Q, 13=K, 14=A) и {@code suit} ({@code String}) — неизменяемые (final).</li>
 *   <li>Валидация: rank в пределах 2..14; suit принадлежит множеству {"hearts", "diamonds", "clubs", "spades"}; иначе {@link IllegalArgumentException}.</li>
 *   <li>Методы: геттеры {@link #getRank()}, {@link #getSuit()}.</li>
 *   <li>equals/hashCode: по rank + suit.</li>
 *   <li>toString: формат "rank of suit" с ЧИСЛОВЫМ rank, напр. "10 of hearts", "14 of spades".</li>
 * </ul>
 */
public class Task26 {

    private final int rank;
    private final String suit;

    public Task26(int rank, String suit) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getRank() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getSuit() {
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

    @Override
    public String toString() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}

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
 * <p>
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
        if (rank < 2 || rank > 14) {
            throw new IllegalArgumentException("NOOOOO");
        }
        if (suit == null || !(suit.equals("hearts") || suit.equals("diamonds") || suit.equals("clubs") || suit.equals("spades"))) {
            throw new IllegalArgumentException("NOOOOO");
        }
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
       return rank;
    }

    public String getSuit() {
       return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Task26 task26 = (Task26) o;
        return rank == task26.rank && Objects.equals(suit, task26.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює поштову адресу (Address).
 * <ul>
 *   <li>Поля: {@code city}, {@code street}, {@code building} — всі {@code String}, незмінні (final).</li>
 *   <li>Валідація: всі три не null та не порожні після {@code trim()}, інакше {@link IllegalArgumentException}.</li>
 *   <li>Методи: гетери {@link #getCity()}, {@link #getStreet()}, {@link #getBuilding()}.</li>
 *   <li>equals/hashCode: за всіма трьома полями.</li>
 *   <li>toString: префікс "Address" зі значеннями полів.</li>
 *   <li>Приклад: {@code new Task25("Kyiv", "Main", "10")} -> "Address{city='Kyiv', street='Main', building='10'}".</li>
 * </ul>
 *
 * RU: Класс моделирует почтовый адрес (Address).
 * <ul>
 *   <li>Поля: {@code city}, {@code street}, {@code building} — все {@code String}, неизменяемые (final).</li>
 *   <li>Валидация: все три не null и не пустые после {@code trim()}, иначе {@link IllegalArgumentException}.</li>
 *   <li>Методы: геттеры {@link #getCity()}, {@link #getStreet()}, {@link #getBuilding()}.</li>
 *   <li>equals/hashCode: по всем трём полям.</li>
 *   <li>toString: префикс "Address" со значениями полей.</li>
 *   <li>Пример: {@code new Task25("Kyiv", "Main", "10")} -> "Address{city='Kyiv', street='Main', building='10'}".</li>
 * </ul>
 */
public class Task25 {

    private final String city;
    private final String street;
    private final String building;

    public Task25(String city, String street, String building) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getCity() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getStreet() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getBuilding() {
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

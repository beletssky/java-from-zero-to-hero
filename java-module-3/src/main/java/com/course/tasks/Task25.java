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
 * <p>
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
        validate(city);
        validate(street);
        validate(building);
        this.city = city;
        this.street = street;
        this.building = building;
    }

    private void validate(String s) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public String getCity() {
        // TODO: реализуй
        return city;
    }

    public String getStreet() {
        // TODO: реализуй
        return street;
    }

    public String getBuilding() {
        // TODO: реализуй
        return building;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task25 task25)) return false;
        return city.equals(task25.city)
                && street.equals(task25.street)
                && building.equals(task25.building);
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(city, street, building);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Address{city=" + city +
                ", street=" + street +
                " building=" + building + "}";
    }
}

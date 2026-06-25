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
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("NOOOOO");
        }
        if (street == null || street.trim().isEmpty()) {
            throw new IllegalArgumentException("NOOOOO");
        }
        if (building == null || building.trim().isEmpty()) {
            throw new IllegalArgumentException("NOOOOO");
        }
        this.city = city;
        this.street = street;
        this.building = building;
    }

    public String getCity() {
       return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Task25 task25 = (Task25) o;
        return Objects.equals(city, task25.city) && Objects.equals(street, task25.street) && Objects.equals(building, task25.building);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, building);
    }

    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + ", street='" + street + '\'' + ", building='" + building + '\'' + "}";
    }
}

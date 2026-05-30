package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює географічні координати (Coordinates).
 * <ul>
 *   <li>Поля: {@code latitude} (широта), {@code longitude} (довгота) — обидва {@code double}, незмінні (final).</li>
 *   <li>Валідація: широта в межах -90..90, довгота в межах -180..180, інакше {@link IllegalArgumentException}.</li>
 *   <li>Методи: гетери {@link #getLatitude()}, {@link #getLongitude()}.</li>
 *   <li>equals: дві координати рівні, якщо І широта, І довгота збігаються з точністю 1e-9 (через {@link Math#abs}).</li>
 *   <li>toString: префікс "Coordinates" разом зі значеннями полів.</li>
 *   <li>Приклад: {@code new Task21(50.45, 30.52)} -> "Coordinates{latitude=50.45, longitude=30.52}".</li>
 * </ul>
 *
 * RU: Класс моделирует географические координаты (Coordinates).
 * <ul>
 *   <li>Поля: {@code latitude} (широта), {@code longitude} (долгота) — оба {@code double}, неизменяемые (final).</li>
 *   <li>Валидация: широта в пределах -90..90, долгота в пределах -180..180, иначе {@link IllegalArgumentException}.</li>
 *   <li>Методы: геттеры {@link #getLatitude()}, {@link #getLongitude()}.</li>
 *   <li>equals: две координаты равны, если И широта, И долгота совпадают с точностью 1e-9 (через {@link Math#abs}).</li>
 *   <li>toString: префикс "Coordinates" вместе со значениями полей.</li>
 *   <li>Пример: {@code new Task21(50.45, 30.52)} -> "Coordinates{latitude=50.45, longitude=30.52}".</li>
 * </ul>
 */
public class Task21 {

    private static final double EPSILON = 1e-9;

    private final double latitude;
    private final double longitude;

    public Task21(double latitude, double longitude) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getLatitude() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getLongitude() {
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

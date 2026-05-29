package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель датчика температури (TemperatureSensor).
 * <p>Поля:
 * <ul>
 *   <li>{@code celsius} — температура в градусах Цельсія (змінюване).</li>
 * </ul>
 * Валідація: -273.15 &le; celsius &le; 1000 (у конструкторі та сетері), інакше IllegalArgumentException.
 * Методи: {@code getCelsius()}; {@code setCelsius(double)};
 * {@code getFahrenheit()} = c*9/5+32; {@code getKelvin()} = c+273.15.
 * toString має префікс "TemperatureSensor" і містить значення celsius.
 *
 * <p>RU: Модель датчика температуры (TemperatureSensor).
 * <p>Поля:
 * <ul>
 *   <li>{@code celsius} — температура в градусах Цельсия (изменяемое).</li>
 * </ul>
 * Валидация: -273.15 &le; celsius &le; 1000 (в конструкторе и сеттере), иначе IllegalArgumentException.
 * Методы: {@code getCelsius()}; {@code setCelsius(double)};
 * {@code getFahrenheit()} = c*9/5+32; {@code getKelvin()} = c+273.15.
 * toString имеет префикс "TemperatureSensor" и содержит значение celsius.
 *
 * <p>Приклад / Пример: new Task13(0.0) -&gt; getFahrenheit()=32.0, getKelvin()=273.15.
 */
public class Task13 {

    private double celsius;

    public Task13(double celsius) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getCelsius() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setCelsius(double celsius) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getFahrenheit() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getKelvin() {
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

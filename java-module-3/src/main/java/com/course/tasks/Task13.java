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
        validateTemperature(celsius);
        this.celsius = celsius;
    }

    private void validateTemperature(double d) {
        double lowestPoint = -273.15;
        double highestPoint = 1000;
        if (d < lowestPoint || d > highestPoint) {
            throw new IllegalArgumentException();
        }
    }

    public double getCelsius() {
        // TODO: реализуй
        return celsius;
    }

    public void setCelsius(double celsius) {
        // TODO: реализуй
        validateTemperature(celsius);
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        // TODO: реализуй
        return this.celsius * 9 / 5 + 32;
    }

    public double getKelvin() {
        // TODO: реализуй
        return this.celsius + 273.15;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task13 task13)) return false;
        return this.celsius == task13.celsius;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(celsius);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "TemperatureSensor " + celsius;
    }
}

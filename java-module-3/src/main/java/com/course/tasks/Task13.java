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
        validate(celsius);
        this.celsius = celsius;
    }

    private void validate(double celsius) {
        if (celsius < -273.15 || celsius > 1000) {
            throw new IllegalArgumentException("NOOOOO");
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        validate(celsius);
        this.celsius = celsius;
    }

    public double getFahrenheit() {

        return this.celsius * 9 / 5 + 32;
    }

    public double getKelvin() {

        return this.celsius + 273.15;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task13 task13 = (Task13) o;
        return celsius == task13.celsius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(celsius);
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" + celsius + "}";
    }
}

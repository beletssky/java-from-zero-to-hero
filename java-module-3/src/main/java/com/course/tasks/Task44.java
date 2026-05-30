package com.course.tasks;

import java.util.Arrays;

/**
 * UA: Многочлен (Polynomial).
 * <p>
 * Поле {@code private final double[] coefficients} зберігає коефіцієнти, де
 * {@code coefficients[0]} — вільний член, {@code coefficients[1]} — коефіцієнт при x,
 * {@code coefficients[2]} — при x^2, і т.д. Конструктор зберігає КОПІЮ масиву.
 * <p>
 * Методи:
 * <ul>
 *   <li>{@code double evaluate(double x)} — обчислює значення многочлена в точці x.</li>
 * </ul>
 * {@code toString} формує рядок виду "3.0 + 2.0x + 1.0x^2": вільний член, потім
 * "&lt;c&gt;x", далі "&lt;c&gt;x^k" для k&gt;=2, об'єднані через " + ".
 * {@code equals/hashCode} — за коефіцієнтами ({@link Arrays#equals}/{@link Arrays#hashCode}).
 * Приклад: коефіцієнти {3,2,1} → evaluate(0)==3.0, evaluate(2)==3+4+4==11.0.
 *
 * <hr>
 * RU: Многочлен (Polynomial).
 * <p>
 * Поле {@code private final double[] coefficients} хранит коэффициенты, где
 * {@code coefficients[0]} — свободный член, {@code coefficients[1]} — коэффициент при x,
 * {@code coefficients[2]} — при x^2, и т.д. Конструктор хранит КОПИЮ массива.
 * <p>
 * Методы:
 * <ul>
 *   <li>{@code double evaluate(double x)} — вычисляет значение многочлена в точке x.</li>
 * </ul>
 * {@code toString} формирует строку вида "3.0 + 2.0x + 1.0x^2": свободный член, затем
 * "&lt;c&gt;x", далее "&lt;c&gt;x^k" для k&gt;=2, объединённые через " + ".
 * {@code equals/hashCode} — по коэффициентам ({@link Arrays#equals}/{@link Arrays#hashCode}).
 * Пример: коэффициенты {3,2,1} → evaluate(0)==3.0, evaluate(2)==3+4+4==11.0.
 */
public class Task44 {

    private final double[] coefficients;

    /**
     * UA: Створює многочлен, зберігаючи копію масиву коефіцієнтів.
     * RU: Создаёт многочлен, сохраняя копию массива коэффициентов.
     *
     * @param coefficients UA: коефіцієнти (від вільного члена) / RU: коэффициенты (от свободного члена)
     */
    public Task44(double[] coefficients) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Обчислює значення многочлена в точці x.
     * RU: Вычисляет значение многочлена в точке x.
     */
    public double evaluate(double x) {
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

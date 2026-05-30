package com.course.tasks;

import java.util.Arrays;

/**
 * UA: Матриця (Matrix).
 * <p>
 * Поле {@code private final int[][] data} зберігає елементи матриці.
 * Конструктор {@code Task43(int[][] data)} робить ГЛИБОКУ КОПІЮ (копіює кожен рядок),
 * тож зміна вихідного масиву ПІСЛЯ створення не впливає на матрицю.
 * <p>
 * Методи:
 * <ul>
 *   <li>{@code int getRows()} — кількість рядків.</li>
 *   <li>{@code int getCols()} — кількість стовпців.</li>
 *   <li>{@code int get(int i, int j)} — елемент; при некоректному індексі кидає
 *       {@link IllegalArgumentException}.</li>
 *   <li>{@code Task43 transpose()} — повертає НОВУ матрицю-транспозицію.</li>
 * </ul>
 * {@code equals/hashCode} — за вмістом ({@link Arrays#deepEquals}/{@link Arrays#deepHashCode}).
 * {@code toString} починається з "Matrix".
 * Приклад: транспозиція 2x3 дає 3x2 зі переставленими елементами.
 *
 * <hr>
 * RU: Матрица (Matrix).
 * <p>
 * Поле {@code private final int[][] data} хранит элементы матрицы.
 * Конструктор {@code Task43(int[][] data)} делает ГЛУБОКУЮ КОПИЮ (копирует каждую
 * строку), поэтому изменение исходного массива ПОСЛЕ создания не влияет на матрицу.
 * <p>
 * Методы:
 * <ul>
 *   <li>{@code int getRows()} — количество строк.</li>
 *   <li>{@code int getCols()} — количество столбцов.</li>
 *   <li>{@code int get(int i, int j)} — элемент; при некорректном индексе бросает
 *       {@link IllegalArgumentException}.</li>
 *   <li>{@code Task43 transpose()} — возвращает НОВУЮ матрицу-транспозицию.</li>
 * </ul>
 * {@code equals/hashCode} — по содержимому ({@link Arrays#deepEquals}/{@link Arrays#deepHashCode}).
 * {@code toString} начинается с "Matrix".
 * Пример: транспонирование 2x3 даёт 3x2 с переставленными элементами.
 */
public class Task43 {

    private final int[][] data;

    /**
     * UA: Створює матрицю, роблячи глибоку копію вхідного масиву.
     * RU: Создаёт матрицу, делая глубокую копию входного массива.
     *
     * @param data UA: вихідні дані / RU: исходные данные
     */
    public Task43(int[][] data) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Кількість рядків.
     * RU: Количество строк.
     */
    public int getRows() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Кількість стовпців.
     * RU: Количество столбцов.
     */
    public int getCols() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає елемент [i][j]; при некоректному індексі кидає IllegalArgumentException.
     * RU: Возвращает элемент [i][j]; при некорректном индексе бросает IllegalArgumentException.
     */
    public int get(int i, int j) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає НОВУ матрицю-транспозицію.
     * RU: Возвращает НОВУЮ матрицу-транспозицию.
     */
    public Task43 transpose() {
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

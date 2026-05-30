package com.course.tasks;

/**
 * UA: Перехрестя зі світлофором (Crossroad).
 * <p>
 * Вкладений enum {@link TrafficLight}: RED, YELLOW, GREEN.
 * Поле {@code current} — змінюване (сетер setCurrent).
 * Метод {@link #next()} перемикає сигнал через switch:
 * <ul>
 *   <li>RED → GREEN</li>
 *   <li>GREEN → YELLOW</li>
 *   <li>YELLOW → RED</li>
 * </ul>
 * Повний цикл: RED → GREEN → YELLOW → RED.
 * <p>
 * RU: Перекрёсток со светофором (Crossroad).
 * <p>
 * Вложенный enum {@link TrafficLight}: RED, YELLOW, GREEN.
 * Поле {@code current} — изменяемое (сеттер setCurrent).
 * Метод {@link #next()} переключает сигнал через switch:
 * <ul>
 *   <li>RED → GREEN</li>
 *   <li>GREEN → YELLOW</li>
 *   <li>YELLOW → RED</li>
 * </ul>
 * Полный цикл: RED → GREEN → YELLOW → RED.
 */
public class Task38 {

    /**
     * UA: Сигнали світлофора: RED, YELLOW, GREEN.
     * RU: Сигналы светофора: RED, YELLOW, GREEN.
     */
    public enum TrafficLight {
        RED, YELLOW, GREEN
    }

    /**
     * UA: Поточний сигнал (змінюване поле).
     * RU: Текущий сигнал (изменяемое поле).
     */
    private TrafficLight current;

    /**
     * UA: Конструктор — задає поточний сигнал.
     * RU: Конструктор — задаёт текущий сигнал.
     */
    public Task38(TrafficLight current) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер поточного сигналу.
     * RU: Геттер текущего сигнала.
     */
    public TrafficLight getCurrent() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Сетер поточного сигналу (змінюване поле).
     * RU: Сеттер текущего сигнала (изменяемое поле).
     */
    public void setCurrent(TrafficLight current) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Перемикає сигнал через switch: RED→GREEN, GREEN→YELLOW, YELLOW→RED.
     * RU: Переключает сигнал через switch: RED→GREEN, GREEN→YELLOW, YELLOW→RED.
     */
    public void next() {
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

package com.course.tasks;

/**
 * UA: Визначення пори року за номером місяця (калькулятор без стану).
 * <p>
 * Вкладений enum {@link Season}: WINTER, SPRING, SUMMER, AUTUMN.
 * Без полів екземпляра; публічний конструктор без аргументів.
 * Метод {@link #seasonByMonth(int)} через switch:
 * <ul>
 *   <li>12, 1, 2 → WINTER</li>
 *   <li>3, 4, 5 → SPRING</li>
 *   <li>6, 7, 8 → SUMMER</li>
 *   <li>9, 10, 11 → AUTUMN</li>
 * </ul>
 * Якщо month &lt; 1 або month &gt; 12 → IllegalArgumentException.
 * Приклад: seasonByMonth(1) == WINTER; seasonByMonth(0) кидає виняток.
 * <p>
 * RU: Определение времени года по номеру месяца (калькулятор без состояния).
 * <p>
 * Вложенный enum {@link Season}: WINTER, SPRING, SUMMER, AUTUMN.
 * Без полей экземпляра; публичный конструктор без аргументов.
 * Метод {@link #seasonByMonth(int)} через switch:
 * <ul>
 *   <li>12, 1, 2 → WINTER</li>
 *   <li>3, 4, 5 → SPRING</li>
 *   <li>6, 7, 8 → SUMMER</li>
 *   <li>9, 10, 11 → AUTUMN</li>
 * </ul>
 * Если month &lt; 1 или month &gt; 12 → IllegalArgumentException.
 * Пример: seasonByMonth(1) == WINTER; seasonByMonth(0) бросает исключение.
 */
public class Task35 {

    /**
     * UA: Пори року: WINTER, SPRING, SUMMER, AUTUMN.
     * RU: Времена года: WINTER, SPRING, SUMMER, AUTUMN.
     */
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    /**
     * UA: Конструктор без аргументів (клас без стану).
     * RU: Конструктор без аргументов (класс без состояния).
     */
    public Task35() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає пору року за місяцем (switch). Невалідний місяць → IllegalArgumentException.
     * RU: Возвращает время года по месяцу (switch). Невалидный месяц → IllegalArgumentException.
     */
    public Season seasonByMonth(int month) {
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

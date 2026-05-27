package com.course.tasks;

/**
 * UA: День тижня.
 * <p>
 * Вкладений enum {@link Day} містить MON, TUE, WED, THU, FRI, SAT, SUN.
 * Поле {@code day} — незмінне (final).
 * Метод {@link #isWeekend()} використовує switch-вираз і повертає {@code true}
 * для SAT та SUN, інакше {@code false}.
 * Приклад: new Task32(Day.SAT).isWeekend() == true.
 * <p>
 * RU: День недели.
 * <p>
 * Вложенный enum {@link Day} содержит MON, TUE, WED, THU, FRI, SAT, SUN.
 * Поле {@code day} — неизменяемое (final).
 * Метод {@link #isWeekend()} использует switch-выражение и возвращает {@code true}
 * для SAT и SUN, иначе {@code false}.
 * Пример: new Task32(Day.SAT).isWeekend() == true.
 */
public class Task32 {

    /**
     * UA: Дні тижня: MON..SUN.
     * RU: Дни недели: MON..SUN.
     */
    public enum Day {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    /**
     * UA: День тижня (незмінне поле).
     * RU: День недели (неизменяемое поле).
     */
    private final Day day;

    /**
     * UA: Конструктор — задає день.
     * RU: Конструктор — задаёт день.
     */
    public Task32(Day day) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер дня.
     * RU: Геттер дня.
     */
    public Day getDay() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: true для SAT та SUN (switch-вираз).
     * RU: true для SAT и SUN (switch-выражение).
     */
    public boolean isWeekend() {
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

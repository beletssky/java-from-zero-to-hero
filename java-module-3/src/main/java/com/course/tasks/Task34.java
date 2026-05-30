package com.course.tasks;

/**
 * UA: Завдання з пріоритетом.
 * <p>
 * Вкладений enum {@link Priority}: LOW, MEDIUM, HIGH, CRITICAL.
 * Поля: {@code title} — незмінне (final); {@code priority} — змінюване (setPriority);
 * {@code done} — змінюване, але встановлюється лише методом {@link #complete()} (геттер isDone()).
 * Метод {@link #complete()} встановлює done = true.
 * Приклад: задача після complete() має isDone() == true.
 * <p>
 * RU: Задача с приоритетом.
 * <p>
 * Вложенный enum {@link Priority}: LOW, MEDIUM, HIGH, CRITICAL.
 * Поля: {@code title} — неизменяемое (final); {@code priority} — изменяемое (setPriority);
 * {@code done} — изменяемое, но устанавливается только методом {@link #complete()} (геттер isDone()).
 * Метод {@link #complete()} устанавливает done = true.
 * Пример: задача после complete() имеет isDone() == true.
 */
public class Task34 {

    /**
     * UA: Пріоритети: LOW, MEDIUM, HIGH, CRITICAL.
     * RU: Приоритеты: LOW, MEDIUM, HIGH, CRITICAL.
     */
    public enum Priority {
        LOW, MEDIUM, HIGH, CRITICAL
    }

    /**
     * UA: Заголовок (незмінне поле).
     * RU: Заголовок (неизменяемое поле).
     */
    private final String title;

    /**
     * UA: Пріоритет (змінюване поле).
     * RU: Приоритет (изменяемое поле).
     */
    private Priority priority;

    /**
     * UA: Прапор виконання (змінюване, через complete()).
     * RU: Флаг выполнения (изменяемое, через complete()).
     */
    private boolean done;

    /**
     * UA: Конструктор — задає заголовок та пріоритет; done = false.
     * RU: Конструктор — задаёт заголовок и приоритет; done = false.
     */
    public Task34(String title, Priority priority) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер заголовка.
     * RU: Геттер заголовка.
     */
    public String getTitle() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер пріоритету.
     * RU: Геттер приоритета.
     */
    public Priority getPriority() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер прапора виконання.
     * RU: Геттер флага выполнения.
     */
    public boolean isDone() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Сетер пріоритету (змінюване поле).
     * RU: Сеттер приоритета (изменяемое поле).
     */
    public void setPriority(Priority priority) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Позначає завдання виконаним (done = true).
     * RU: Помечает задачу выполненной (done = true).
     */
    public void complete() {
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

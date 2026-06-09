package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює пару рядків (Pair).
 * <ul>
 *   <li>Поля: {@code first}, {@code second} — обидва {@code String}, незмінні (final).</li>
 *   <li>Валідація: жоден з аргументів не може бути null (будь-який null -> {@link IllegalArgumentException}).</li>
 *   <li>Методи: гетери {@link #getFirst()}, {@link #getSecond()}.</li>
 *   <li>equals/hashCode: за обома полями.</li>
 *   <li>toString: префікс "Pair" зі значеннями полів.</li>
 *   <li>Приклад: {@code new Task22("a", "b")} -> "Pair{first='a', second='b'}".</li>
 * </ul>
 * <p>
 * RU: Класс моделирует пару строк (Pair).
 * <ul>
 *   <li>Поля: {@code first}, {@code second} — обе {@code String}, неизменяемые (final).</li>
 *   <li>Валидация: ни один из аргументов не может быть null (любой null -> {@link IllegalArgumentException}).</li>
 *   <li>Методы: геттеры {@link #getFirst()}, {@link #getSecond()}.</li>
 *   <li>equals/hashCode: по обоим полям.</li>
 *   <li>toString: префикс "Pair" со значениями полей.</li>
 *   <li>Пример: {@code new Task22("a", "b")} -> "Pair{first='a', second='b'}".</li>
 * </ul>
 */
public class Task22 {

    private final String first;
    private final String second;

    public Task22(String first, String second) {
        // TODO: реализуй
        validate(first);
        validate(second);
        this.first = first;
        this.second = second;
    }

    private void validate(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
    }

    public String getFirst() {
        // TODO: реализуй
        return first;
    }

    public String getSecond() {
        // TODO: реализуй
        return second;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task22 task22)) return false;
        return this.first.equals(task22.first)
                && this.second.equals(task22.second);
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Pair{first=" + first +
                ", second=" + second;
    }
}

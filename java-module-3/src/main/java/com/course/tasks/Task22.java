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
 *
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
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getFirst() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getSecond() {
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

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
        if (first == null) {
            throw new IllegalArgumentException("");
        }
        if (second == null) {
            throw new IllegalArgumentException("");
        }
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task22 that = (Task22) o;
        return this.first.equals(that.first) && this.second.equals(that.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Pair{first='" + first + "', second='" + second + "'}";
    }
}

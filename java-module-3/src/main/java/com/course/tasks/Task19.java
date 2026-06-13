package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель пароля (Password).
 * <p>Поля:
 * <ul>
 *   <li>{@code hash} — імітація хешу (незмінне, final; фактично зберігає сирий рядок).</li>
 * </ul>
 * Конструктор {@code Task19(String raw)} валідує: довжина &ge; 8, хоча б одна цифра,
 * хоча б одна велика літера (інакше IllegalArgumentException), потім зберігає raw у hash.
 * Метод {@code matches(String raw)} повертає {@code hash.equals(raw)}.
 * toString повертає "Password{hash=***}" і НЕ містить реального значення.
 * equals/hashCode за полем hash.
 *
 * <p>RU: Модель пароля (Password).
 * <p>Поля:
 * <ul>
 *   <li>{@code hash} — имитация хеша (неизменяемое, final; фактически хранит сырую строку).</li>
 * </ul>
 * Конструктор {@code Task19(String raw)} валидирует: длина &ge; 8, хотя бы одна цифра,
 * хотя бы одна заглавная буква (иначе IllegalArgumentException), затем сохраняет raw в hash.
 * Метод {@code matches(String raw)} возвращает {@code hash.equals(raw)}.
 * toString возвращает "Password{hash=***}" и НЕ содержит реального значения.
 * equals/hashCode по полю hash.
 *
 * <p>Приклад / Пример: new Task19("Secret12").matches("Secret12") -&gt; true.
 */
public class Task19 {

    private final String hash;

    public Task19(String raw) {
        if (raw.length() < 8) {
            throw new IllegalArgumentException("");
        }
        boolean hasDigit = false;
        boolean hasUpper = false;
        for (int i = 0; i < raw.length(); i++) {
            if (Character.isDigit(raw.charAt(i))) hasDigit = true;
            if (Character.isUpperCase(raw.charAt(i))) hasUpper = true;
        }
        if (!hasDigit || !hasUpper) {
            throw new IllegalArgumentException("");
        }
        this.hash = raw;
    }

    public String getHash() {
        return hash;
    }

    public boolean matches(String raw) {
        return hash.equals(raw);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task19 that = (Task19) o;
        return this.hash.equals(that.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }

    @Override
    public String toString() {
        return "Password{hash=***}";
    }
}

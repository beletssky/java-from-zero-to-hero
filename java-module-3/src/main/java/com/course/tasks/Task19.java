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
        // TODO: реализуй
        validate(raw);
        this.hash = raw;
    }

    private void validate(String s) {
        if (s == null || s.length() < 8) {
            throw new IllegalArgumentException();
        }
        boolean hasDigit = false;
        boolean hasUpper = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (hasDigit && hasUpper) break;
        }
        if (!hasDigit || !hasUpper) {
            throw new IllegalArgumentException();
        }

    }

    public String getHash() {
        // TODO: реализуй
        return hash;
    }

    public boolean matches(String raw) {
        // TODO: реализуй
        return hash.equals(raw);
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task19 task19)) return false;
        return Objects.equals(this.hash, task19.hash);
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(hash);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Password{hash=***}";
    }
}

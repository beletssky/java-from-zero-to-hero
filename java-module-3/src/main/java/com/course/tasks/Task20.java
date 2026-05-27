package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель результату тесту (Score).
 * <p>Поля:
 * <ul>
 *   <li>{@code correct} — кількість правильних відповідей (змінюване).</li>
 *   <li>{@code total} — загальна кількість запитань (змінюване).</li>
 * </ul>
 * Валідація: 0 &le; correct &le; total (у конструкторі), інакше IllegalArgumentException.
 * Методи: {@code addCorrect()} — correct++ і total++ (інваріант correct &le; total зберігається);
 * {@code addWrong(int n)} (n &ge; 0, інакше IAE; total += n);
 * {@code getPercentage()} = correct*100.0/total, або 0.0 якщо total == 0.
 * Гетери: getCorrect/getTotal. toString має префікс "Score" і містить поля.
 *
 * <p>RU: Модель результата теста (Score).
 * <p>Поля:
 * <ul>
 *   <li>{@code correct} — количество правильных ответов (изменяемое).</li>
 *   <li>{@code total} — общее количество вопросов (изменяемое).</li>
 * </ul>
 * Валидация: 0 &le; correct &le; total (в конструкторе), иначе IllegalArgumentException.
 * Методы: {@code addCorrect()} — correct++ и total++ (инвариант correct &le; total сохраняется);
 * {@code addWrong(int n)} (n &ge; 0, иначе IAE; total += n);
 * {@code getPercentage()} = correct*100.0/total, или 0.0 если total == 0.
 * Геттеры: getCorrect/getTotal. toString имеет префикс "Score" и содержит поля.
 *
 * <p>Приклад / Пример: new Task20(7, 10).getPercentage() -&gt; 70.0.
 */
public class Task20 {

    private int correct;
    private int total;

    public Task20(int correct, int total) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getCorrect() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getTotal() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void addCorrect() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void addWrong(int n) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getPercentage() {
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

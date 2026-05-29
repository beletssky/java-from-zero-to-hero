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
        if (correct < 0 || correct > total) {
            throw new IllegalArgumentException();
        }
        this.correct = correct;
        this.total = total;
    }

    public int getCorrect() {
        // TODO: реализуй
        return correct;
    }

    public int getTotal() {
        // TODO: реализуй
        return total;
    }

    public void addCorrect() {
        // TODO: реализуй
        correct++;
        total++;
        if (correct > total) {
            throw new IllegalArgumentException();
        }
    }

    public void addWrong(int n) {
        // TODO: реализуй
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        total += n;
    }

    public double getPercentage() {
        // TODO: реализуй
        if (total == 0) {
            return 0.0;
        }
        return correct * 100.0 / total;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task20 task20)) return false;
        return this.total == task20.total && this.correct == task20.correct;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(total, correct);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Score" + total + correct;
    }
}

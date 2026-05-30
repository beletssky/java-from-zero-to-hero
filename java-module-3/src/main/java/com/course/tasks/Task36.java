package com.course.tasks;

/**
 * UA: Студент з оцінкою (Student).
 * <p>
 * Вкладений enum {@link Grade}: A, B, C, D, F.
 * Поля: {@code name} — незмінне (final); {@code score} — змінюване (0..100), сетер setScore валідовує.
 * Конструктор валідовує score у межах 0..100, інакше IllegalArgumentException.
 * Метод {@link #getGrade()} через ланцюжок if/else-if з порогами:
 * <ul>
 *   <li>score &gt;= 90 → A</li>
 *   <li>score &gt;= 75 → B</li>
 *   <li>score &gt;= 65 → C</li>
 *   <li>score &gt;= 50 → D</li>
 *   <li>інакше → F</li>
 * </ul>
 * Приклади меж: 90→A, 89→B, 75→B, 50→D, 49→F.
 * <p>
 * RU: Студент с оценкой (Student).
 * <p>
 * Вложенный enum {@link Grade}: A, B, C, D, F.
 * Поля: {@code name} — неизменяемое (final); {@code score} — изменяемое (0..100), сеттер setScore валидирует.
 * Конструктор валидирует score в пределах 0..100, иначе IllegalArgumentException.
 * Метод {@link #getGrade()} через цепочку if/else-if с порогами:
 * <ul>
 *   <li>score &gt;= 90 → A</li>
 *   <li>score &gt;= 75 → B</li>
 *   <li>score &gt;= 65 → C</li>
 *   <li>score &gt;= 50 → D</li>
 *   <li>иначе → F</li>
 * </ul>
 * Примеры границ: 90→A, 89→B, 75→B, 50→D, 49→F.
 */
public class Task36 {

    /**
     * UA: Оцінки: A, B, C, D, F.
     * RU: Оценки: A, B, C, D, F.
     */
    public enum Grade {
        A, B, C, D, F
    }

    /**
     * UA: Ім'я (незмінне поле).
     * RU: Имя (неизменяемое поле).
     */
    private final String name;

    /**
     * UA: Бал 0..100 (змінюване поле).
     * RU: Балл 0..100 (изменяемое поле).
     */
    private int score;

    /**
     * UA: Конструктор — задає ім'я та бал; валідовує score у межах 0..100.
     * RU: Конструктор — задаёт имя и балл; валидирует score в пределах 0..100.
     */
    public Task36(String name, int score) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер імені.
     * RU: Геттер имени.
     */
    public String getName() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер балу.
     * RU: Геттер балла.
     */
    public int getScore() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Сетер балу з валідацією 0..100 (змінюване поле).
     * RU: Сеттер балла с валидацией 0..100 (изменяемое поле).
     */
    public void setScore(int score) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає оцінку за порогами (if/else-if): &gt;=90 A, &gt;=75 B, &gt;=65 C, &gt;=50 D, інакше F.
     * RU: Возвращает оценку по порогам (if/else-if): &gt;=90 A, &gt;=75 B, &gt;=65 C, &gt;=50 D, иначе F.
     */
    public Grade getGrade() {
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

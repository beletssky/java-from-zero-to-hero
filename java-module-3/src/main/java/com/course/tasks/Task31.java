package com.course.tasks;

/**
 * UA: Користувач із статусом облікового запису.
 * <p>
 * Вкладений enum {@link Status} описує можливі стани: ACTIVE (активний),
 * INACTIVE (неактивний), BANNED (заблокований).
 * Поле {@code status} — змінюване, має сетер {@link #setStatus(Status)}.
 * Метод {@link #canLogin()} повертає {@code true} лише коли статус ACTIVE.
 * Приклад: new Task31(Status.ACTIVE).canLogin() == true.
 * <p>
 * RU: Пользователь со статусом учётной записи.
 * <p>
 * Вложенный enum {@link Status} описывает возможные состояния: ACTIVE (активный),
 * INACTIVE (неактивный), BANNED (заблокирован).
 * Поле {@code status} — изменяемое, имеет сеттер {@link #setStatus(Status)}.
 * Метод {@link #canLogin()} возвращает {@code true} только когда статус ACTIVE.
 * Пример: new Task31(Status.ACTIVE).canLogin() == true.
 */
public class Task31 {

    /**
     * UA: Стани облікового запису: ACTIVE — активний, INACTIVE — неактивний, BANNED — заблокований.
     * RU: Состояния учётной записи: ACTIVE — активный, INACTIVE — неактивный, BANNED — заблокирован.
     */
    public enum Status {
        ACTIVE, INACTIVE, BANNED
    }

    /**
     * UA: Поточний статус (змінюване поле).
     * RU: Текущий статус (изменяемое поле).
     */
    private Status status;

    /**
     * UA: Конструктор — задає статус.
     * RU: Конструктор — задаёт статус.
     */
    public Task31(Status status) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Геттер статусу.
     * RU: Геттер статуса.
     */
    public Status getStatus() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Сетер статусу (змінюване поле).
     * RU: Сеттер статуса (изменяемое поле).
     */
    public void setStatus(Status status) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    /**
     * UA: Повертає true лише для статусу ACTIVE.
     * RU: Возвращает true только для статуса ACTIVE.
     */
    public boolean canLogin() {
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

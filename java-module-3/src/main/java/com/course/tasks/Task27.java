package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює замовлення (Order).
 * <ul>
 *   <li>Поля: {@code id} ({@code long}, final), {@code customer} ({@code String}, final),
 *       {@code totalKopecks} ({@code long}, final), {@code paid} ({@code boolean}, ИЗМЕНЯЕМОЕ).</li>
 *   <li>Методи: гетери {@link #getId()}, {@link #getCustomer()}, {@link #getTotalKopecks()}, {@link #isPaid()};
 *       {@link #markAsPaid()} встановлює {@code paid = true}. Окремого сетера немає.</li>
 *   <li>equals/hashCode: ТІЛЬКИ за {@code id}.</li>
 *   <li>toString: префікс "Order" зі значеннями полів.</li>
 *   <li>Приклад: {@code new Task27(1L, "Ivan", 12300L, false)} -> "Order{id=1, customer='Ivan', totalKopecks=12300, paid=false}".</li>
 * </ul>
 *
 * RU: Класс моделирует заказ (Order).
 * <ul>
 *   <li>Поля: {@code id} ({@code long}, final), {@code customer} ({@code String}, final),
 *       {@code totalKopecks} ({@code long}, final), {@code paid} ({@code boolean}, ИЗМЕНЯЕМОЕ).</li>
 *   <li>Методы: геттеры {@link #getId()}, {@link #getCustomer()}, {@link #getTotalKopecks()}, {@link #isPaid()};
 *       {@link #markAsPaid()} устанавливает {@code paid = true}. Отдельного сеттера нет.</li>
 *   <li>equals/hashCode: ТОЛЬКО по {@code id}.</li>
 *   <li>toString: префикс "Order" со значениями полей.</li>
 *   <li>Пример: {@code new Task27(1L, "Ivan", 12300L, false)} -> "Order{id=1, customer='Ivan', totalKopecks=12300, paid=false}".</li>
 * </ul>
 */
public class Task27 {

    private final long id;
    private final String customer;
    private final long totalKopecks;
    private boolean paid;

    public Task27(long id, String customer, long totalKopecks, boolean paid) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public long getId() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getCustomer() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public long getTotalKopecks() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public boolean isPaid() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void markAsPaid() {
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

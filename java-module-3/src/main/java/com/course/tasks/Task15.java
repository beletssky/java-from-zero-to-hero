package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель товару (Product).
 * <p>Поля:
 * <ul>
 *   <li>{@code name} — назва (незмінне, final).</li>
 *   <li>{@code priceKopecks} — ціна в копійках (змінюване, &ge; 0).</li>
 *   <li>{@code stock} — залишок на складі (змінюване, &ge; 0).</li>
 * </ul>
 * Валідація: price &ge; 0, stock &ge; 0, інакше IllegalArgumentException.
 * Сетери: {@code setPriceKopecks(long)} (&ge; 0); {@code setStock(int)} (&ge; 0).
 * Методи: {@code sell(int qty)} (qty &gt; 0 і stock &ge; qty, інакше IAE; зменшує stock);
 * {@code restock(int qty)} (qty &gt; 0, інакше IAE; збільшує stock).
 * toString має префікс "Product" і містить поля.
 *
 * <p>RU: Модель товара (Product).
 * <p>Поля:
 * <ul>
 *   <li>{@code name} — название (неизменяемое, final).</li>
 *   <li>{@code priceKopecks} — цена в копейках (изменяемое, &ge; 0).</li>
 *   <li>{@code stock} — остаток на складе (изменяемое, &ge; 0).</li>
 * </ul>
 * Валидация: price &ge; 0, stock &ge; 0, иначе IllegalArgumentException.
 * Сеттеры: {@code setPriceKopecks(long)} (&ge; 0); {@code setStock(int)} (&ge; 0).
 * Методы: {@code sell(int qty)} (qty &gt; 0 и stock &ge; qty, иначе IAE; уменьшает stock);
 * {@code restock(int qty)} (qty &gt; 0, иначе IAE; увеличивает stock).
 * toString имеет префикс "Product" и содержит поля.
 *
 * <p>Приклад / Пример: new Task15("Milk", 2500, 10).
 */
public class Task15 {

    private final String name;
    private long priceKopecks;
    private int stock;

    public Task15(String name, long priceKopecks, int stock) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getName() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public long getPriceKopecks() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getStock() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setPriceKopecks(long priceKopecks) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setStock(int stock) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void sell(int qty) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void restock(int qty) {
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

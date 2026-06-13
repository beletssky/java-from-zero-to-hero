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
        if (priceKopecks < 0) {
            throw new IllegalArgumentException("");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("");
        }
        this.name = name;
        this.priceKopecks = priceKopecks;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public long getPriceKopecks() {
        return priceKopecks;
    }

    public int getStock() {
        return stock;
    }

    public void setPriceKopecks(long priceKopecks) {
        if (priceKopecks < 0) {
            throw new IllegalArgumentException("");
        }
        this.priceKopecks = priceKopecks;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("");
        }
        this.stock = stock;
    }

    public void sell(int qty) {
        if (qty <= 0 || stock < qty) {
            throw new IllegalArgumentException("");
        }
        stock -= qty;
    }

    public void restock(int qty) {
        if (qty <= 0) {
            throw new IllegalArgumentException("");
        }
        stock += qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task15 that = (Task15) o;
        return this.name.equals(that.name) && this.priceKopecks == that.priceKopecks && this.stock == that.stock;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priceKopecks, stock);
    }

    @Override
    public String toString() {
        return "Product{name=" + name + ", priceKopecks=" + priceKopecks +", stock=" + stock + "}";
    }
}
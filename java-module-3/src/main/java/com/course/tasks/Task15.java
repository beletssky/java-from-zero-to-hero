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
        validateAmount(priceKopecks);
        validateAmount(stock);
        this.name = name;
        this.priceKopecks = priceKopecks;
        this.stock = stock;
    }

    private void validateAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }

    private void validateAmount(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public long getPriceKopecks() {
        // TODO: реализуй
        return priceKopecks;
    }

    public int getStock() {
        // TODO: реализуй
        return stock;
    }

    public void setPriceKopecks(long priceKopecks) {
        // TODO: реализуй
        validateAmount(priceKopecks);
        this.priceKopecks = priceKopecks;
    }

    public void setStock(int stock) {
        // TODO: реализуй
        validateAmount(stock);
        this.stock = stock;
    }

    public int sell(int qty) {
        // TODO: реализуй
        if (qty <= 0 || qty > stock) {
            throw new IllegalArgumentException();
        }
        stock -= qty;
        return stock;
    }

    public int restock(int qty) {
        // TODO: реализуй
        if (qty <= 0) {
            throw new IllegalArgumentException();
        }
        stock += qty;
        return stock;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task15 task15)) return false;
        return Objects.equals(this.name, task15.name)
                && this.stock == task15.stock
                && this.priceKopecks == task15.priceKopecks;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(name, stock, priceKopecks);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Product " + name + stock + priceKopecks;
    }
}

package com.course.task03;

import java.util.Objects;

/**
 * Товар корзины с именем и ценой в копейках.
 * Используется в {@link Task03} для расчёта итога.
 */
public class Item {

    private String name;
    private long priceKopecks;

    public Item(String name, long priceKopecks) {
        // TODO: реализуй
        this.name = name;
        this.priceKopecks = priceKopecks;
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public long getPriceKopecks() {
        // TODO: реализуй
        return priceKopecks;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return this.priceKopecks == item.priceKopecks
                && this.name.equals(item.name);

    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(name, priceKopecks);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Item{name='" + name + "', priceKopecks=" + priceKopecks + "}";
    }
}

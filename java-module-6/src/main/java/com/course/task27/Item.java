package com.course.task27;

import java.util.Objects;

/**
 * Item: товар склада с именем и количеством.
 * Используется как значение в InventoryManager (Task27).
 */
public class Item {

    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        // TODO: реализуй
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public int getQuantity() {
        // TODO: реализуй
        return quantity;
    }

    public void setQuantity(int quantity) {
        // TODO: реализуй
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return this.name.equals(item.name) && this.quantity == item.quantity;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(name, quantity);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Item{name='" + name + "', quantity=" + quantity + "}";
    }
}

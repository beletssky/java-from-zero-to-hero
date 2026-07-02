package com.course.task27;

import java.util.HashMap;
import java.util.Map;

/**
 * Task27 (InventoryManager): управляет складом товаров по имени.
 * Все операции по неизвестному имени бросают IllegalArgumentException.
 */
public class Task27 {

    private Map<String, Item> items = new HashMap<>();

    public void addItem(Item i) {
        // TODO: реализуй
        if (i == null || i.getName() == null) {
            throw new IllegalArgumentException();
        }
        items.put(i.getName(), i);
    }

    public void removeItem(String name) {
        // TODO: реализуй
        if (!items.containsKey(name)) {
            throw new IllegalArgumentException();
        }
        items.remove(name);
    }

    public void increaseQuantity(String name, int by) {
        // TODO: реализуй
        Item item = items.get(name);
        if (item == null) {
            throw new IllegalArgumentException();
        }

        item.setQuantity(item.getQuantity() + by);
    }

    public Item getItem(String name) {
        // TODO: реализуй
        Item item = items.get(name);
        if (item == null) {
            throw new IllegalArgumentException();
        }
        return item;
    }
}

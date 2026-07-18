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
    items.put(i.getName(), i);
  }

  public void removeItem(String name) {
    if (!items.containsKey(name)) {
      throw new IllegalArgumentException("Товар не найден: " + name);
    }
    items.remove(name);
  }

  public void increaseQuantity(String name, int by) {
    Item item =  getItem(name);
    item.setQuantity(item.getQuantity() + by);
  }

  public Item getItem(String name) {
    if (!items.containsKey(name)) {
      throw new IllegalArgumentException("Товар не найден: " + name);
    }
    return items.get(name);
  }
}

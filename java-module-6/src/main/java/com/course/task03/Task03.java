package com.course.task03;

import java.util.ArrayList;
import java.util.List;

/**
 * Корзина покупок: хранит товары и считает итоговую сумму.
 * Поддерживает добавление, удаление по имени и копию списка позиций.
 */
public class Task03 {

  private List<Item> items = new ArrayList<>();

  public void add(Item i) {
    items.add(i);
  }

  public void removeByName(String name) {
    items.removeIf(item ->
            (name == null && item.getName() == null) ||
                    (name != null && name.equals(item.getName()))
    );
  }

  public long total() {
    long sum = 0;
    for (Item item : items) {
      sum += item.getPriceKopecks();
    }
    return sum;
  }

  public int size() {
    return items.size();
  }

  public List<Item> items() {
    return new ArrayList<>(items);
  }
}
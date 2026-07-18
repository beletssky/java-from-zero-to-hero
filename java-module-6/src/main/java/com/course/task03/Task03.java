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
        // TODO: реализуй
        items.add(i);
    }

    public void removeByName(String name) {
        // TODO: реализуй
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(name)) {
                items.remove(i);
                break;
            }
        }
    }

    public long total() {
        // TODO: реализуй
        long sum = 0;

        for (Item item : items) {
            sum += item.getPriceKopecks();
        }

        return sum;
    }

    public int size() {
        // TODO: реализуй
        return items.size();
    }

    public List<Item> items() {
        // TODO: реализуй
        return new ArrayList<>(items);
    }
}

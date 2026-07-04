package com.course.task35;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Задача 35: сортировка товаров через разные компараторы.
 * Каждый метод возвращает новый список, исходный не меняется.
 */
public class Task35 {

    public List<Product> byPrice(List<Product> input) {
        // TODO: реализуй
        List<Product> result = new ArrayList<>(input);
        result.sort(Comparator.comparingLong(Product::getPriceKopecks));
        return result;
    }

    public List<Product> byRating(List<Product> input) {
        // TODO: реализуй
        List<Product> result = new ArrayList<>(input);
        result.sort(Comparator.comparingInt(Product::getRating).reversed());
        return result;
    }

    public List<Product> byName(List<Product> input) {
        // TODO: реализуй
        List<Product> result = new ArrayList<>(input);
        result.sort(Comparator.comparing(Product::getName, Comparator.nullsFirst(Comparator.naturalOrder())));
        return result;
    }
}

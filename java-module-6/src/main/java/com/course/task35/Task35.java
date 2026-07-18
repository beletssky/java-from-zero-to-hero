package com.course.task35;

import java.util.List;

/**
 * Задача 35: сортировка товаров через разные компараторы.
 * Каждый метод возвращает новый список, исходный не меняется.
 */
public class Task35 {

  public List<Product> byPrice(List<Product> input) {
    List<Product> copy = new java.util.ArrayList<>(input);

    copy.sort((p1, p2) -> Long.compare(p1.getPriceKopecks(), p2.getPriceKopecks()));

    return copy;
  }

  public List<Product> byRating(List<Product> input) {
    List<Product> copy = new java.util.ArrayList<>(input);

    copy.sort((p1, p2) -> Integer.compare(p2.getRating(), p1.getRating()));

    return copy;
  }

  public List<Product> byName(List<Product> input) {
    List<Product> copy = new java.util.ArrayList<>(input);

    copy.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

    return copy;
  }
}
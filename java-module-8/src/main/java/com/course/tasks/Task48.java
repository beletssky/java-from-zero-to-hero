package com.course.tasks;

import com.course.model.Item;
import com.course.model.Order;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Task48 {

  private Task48() {}

  /**
   * Возвращает множество уникальных имён товаров, встречающихся во всех заказах.
   * Реализация использует {@code flatMap} по товарам заказа и {@code Collectors.toSet()}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>Два заказа с товарами [Milk, Bread] и [Milk, Cheese] → {@code {"Milk","Bread","Cheese"}}.</li>
   *   <li>{@code allProducts(List.of())} → {@code {}} (пустое множество).</li>
   * </ul>
   */
  public static Set<String> allProducts(List<Order> orders) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}

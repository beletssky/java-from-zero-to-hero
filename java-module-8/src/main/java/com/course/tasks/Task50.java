package com.course.tasks;

import com.course.model.Item;
import com.course.model.Order;
import java.util.Comparator;
import java.util.List;

public final class Task50 {

  private Task50() {}

  /**
   * Возвращает имена трёх самых дорогих различных товаров среди всех заказов,
   * упорядоченных по убыванию цены. Если различных товаров меньше трёх — возвращается,
   * сколько есть. Различие определяется через {@link Item#equals} (по имени и цене).
   *
   * <p>Пример:
   * <ul>
   *   <li>Товары [Milk/2.0, Bread/1.0, Cheese/5.0, Apple/3.0, Butter/4.0] →
   *       {@code ["Cheese","Butter","Apple"]}.</li>
   *   <li>{@code top3ExpensiveProducts(List.of())} → {@code []}.</li>
   *   <li>Всего один различный товар → результат длины 1.</li>
   * </ul>
   */
  public static List<String> top3ExpensiveProducts(List<Order> orders) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  @SuppressWarnings("unused")
  private static Comparator<Item> byPriceDesc() {
    return Comparator.comparingDouble(Item::getPrice).reversed();
  }
}

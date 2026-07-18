package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.course.model.Item;
import com.course.model.Order;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task50Test {

  @Test
  void top3ExpensiveProducts_returnsThreeMostExpensiveByDescendingPrice() {
    Order o1 = new Order(1, "Alice",
        List.of(new Item("Milk", 2.0), new Item("Bread", 1.0)));
    Order o2 = new Order(2, "Bob",
        List.of(new Item("Cheese", 5.0), new Item("Apple", 3.0), new Item("Butter", 4.0)));
    assertEquals(
        List.of("Cheese", "Butter", "Apple"),
        Task50.top3ExpensiveProducts(List.of(o1, o2)));
  }

  @Test
  void top3ExpensiveProducts_returnsEmptyListForEmptyOrders() {
    assertEquals(List.of(), Task50.top3ExpensiveProducts(List.of()));
  }

  @Test
  void top3ExpensiveProducts_returnsSingleWhenOnlyOneDistinctItemExists() {
    Order o1 = new Order(1, "Alice", List.of(new Item("Milk", 2.0)));
    Order o2 = new Order(2, "Bob", List.of(new Item("Milk", 2.0)));
    assertEquals(List.of("Milk"), Task50.top3ExpensiveProducts(List.of(o1, o2)));
  }

  @Test
  void top3ExpensiveProducts_returnsAllWhenFewerThanThreeDistinctItems() {
    Order o = new Order(1, "Alice",
        List.of(new Item("Milk", 2.0), new Item("Bread", 1.0)));
    assertEquals(
        List.of("Milk", "Bread"),
        Task50.top3ExpensiveProducts(List.of(o)));
  }

  @Test
  void top3ExpensiveProducts_deduplicatesIdenticalItemsAcrossOrders() {
    Order o1 = new Order(1, "Alice",
        List.of(new Item("Milk", 2.0), new Item("Bread", 1.0), new Item("Cheese", 5.0)));
    Order o2 = new Order(2, "Bob",
        List.of(new Item("Milk", 2.0), new Item("Cheese", 5.0)));
    assertEquals(
        List.of("Cheese", "Milk", "Bread"),
        Task50.top3ExpensiveProducts(List.of(o1, o2)));
  }

  @Test
  void top3ExpensiveProducts_limitsToThreeEvenWhenManyItemsAreAvailable() {
    Order o = new Order(1, "Alice",
        List.of(
            new Item("A", 10.0),
            new Item("B", 9.0),
            new Item("C", 8.0),
            new Item("D", 7.0),
            new Item("E", 6.0)));
    assertEquals(
        List.of("A", "B", "C"),
        Task50.top3ExpensiveProducts(List.of(o)));
  }
}

package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Item;
import com.course.model.Order;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Task48Test {

  @Test
  void allProducts_collectsUniqueNamesAcrossOrders() {
    Order o1 = new Order(1, "Alice", List.of(new Item("Milk", 2.0), new Item("Bread", 1.0)));
    Order o2 = new Order(2, "Bob", List.of(new Item("Milk", 2.0), new Item("Cheese", 5.0)));
    assertEquals(Set.of("Milk", "Bread", "Cheese"), Task48.allProducts(List.of(o1, o2)));
  }

  @Test
  void allProducts_returnsEmptySetForEmptyOrders() {
    assertEquals(Set.of(), Task48.allProducts(List.of()));
  }

  @Test
  void allProducts_returnsSingleNameForSingleOrderSingleItem() {
    Order o = new Order(1, "Alice", List.of(new Item("Apple", 3.0)));
    assertEquals(Set.of("Apple"), Task48.allProducts(List.of(o)));
  }

  @Test
  void allProducts_deduplicatesRepeatedNames() {
    Order o1 = new Order(1, "Alice", List.of(new Item("Milk", 2.0), new Item("Milk", 2.0)));
    Order o2 = new Order(2, "Bob", List.of(new Item("Milk", 2.0)));
    assertEquals(Set.of("Milk"), Task48.allProducts(List.of(o1, o2)));
  }

  @Test
  void allProducts_containsExpectedNamesAcrossThreeOrders() {
    Order o1 = new Order(1, "Alice", List.of(new Item("Milk", 2.0), new Item("Bread", 1.0)));
    Order o2 = new Order(2, "Bob", List.of(new Item("Cheese", 5.0)));
    Order o3 = new Order(3, "Cara", List.of(new Item("Apple", 3.0), new Item("Butter", 4.0)));
    Set<String> result = Task48.allProducts(List.of(o1, o2, o3));
    assertEquals(5, result.size());
    assertTrue(result.containsAll(Set.of("Milk", "Bread", "Cheese", "Apple", "Butter")));
  }
}

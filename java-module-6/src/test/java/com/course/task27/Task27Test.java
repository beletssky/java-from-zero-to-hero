package com.course.task27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Task27Test {

  @Test
  void addItemAndGetItemReturnsSameItem() {
    Task27 inv = new Task27();
    Item apple = new Item("apple", 5);
    inv.addItem(apple);
    assertEquals(apple, inv.getItem("apple"));
  }

  @Test
  void removeItemDeletesEntry() {
    Task27 inv = new Task27();
    inv.addItem(new Item("apple", 5));
    inv.removeItem("apple");
    assertThrows(IllegalArgumentException.class, () -> inv.getItem("apple"));
  }

  @Test
  void removeItemThrowsWhenNotFound() {
    Task27 inv = new Task27();
    assertThrows(IllegalArgumentException.class, () -> inv.removeItem("ghost"));
  }

  @Test
  void increaseQuantityUpdatesItem() {
    Task27 inv = new Task27();
    inv.addItem(new Item("apple", 5));
    inv.increaseQuantity("apple", 3);
    assertEquals(8, inv.getItem("apple").getQuantity());
  }

  @Test
  void increaseQuantityThrowsWhenItemMissing() {
    Task27 inv = new Task27();
    assertThrows(IllegalArgumentException.class, () -> inv.increaseQuantity("ghost", 1));
  }

  @Test
  void getItemThrowsWhenNotFound() {
    Task27 inv = new Task27();
    assertThrows(IllegalArgumentException.class, () -> inv.getItem("ghost"));
  }

  @Test
  void addItemOverridesItemWithSameName() {
    Task27 inv = new Task27();
    inv.addItem(new Item("apple", 5));
    inv.addItem(new Item("apple", 99));
    assertEquals(99, inv.getItem("apple").getQuantity());
  }
}

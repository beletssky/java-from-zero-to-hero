package com.course.task03;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task03Test {

  @Test
  void add_increasesSize() {
    Task03 cart = new Task03();
    cart.add(new Item("bread", 5000));
    cart.add(new Item("milk", 8000));
    assertEquals(2, cart.size());
  }

  @Test
  void total_returnsSumOfPrices() {
    Task03 cart = new Task03();
    cart.add(new Item("bread", 5000));
    cart.add(new Item("milk", 8000));
    assertEquals(13000L, cart.total());
  }

  @Test
  void total_isZero_whenEmpty() {
    Task03 cart = new Task03();
    assertEquals(0L, cart.total());
  }

  @Test
  void removeByName_removesFirstMatching() {
    Task03 cart = new Task03();
    cart.add(new Item("bread", 5000));
    cart.add(new Item("milk", 8000));
    cart.add(new Item("bread", 6000));
    cart.removeByName("bread");
    assertEquals(2, cart.size());
    assertEquals(14000L, cart.total());
  }

  @Test
  void removeByName_doesNothing_whenNotFound() {
    Task03 cart = new Task03();
    cart.add(new Item("bread", 5000));
    cart.removeByName("cheese");
    assertEquals(1, cart.size());
  }

  @Test
  void items_returnsCopy_mutationDoesNotAffectInternalState() {
    Task03 cart = new Task03();
    cart.add(new Item("bread", 5000));
    List<Item> copy = cart.items();
    copy.add(new Item("extra", 100));
    assertEquals(1, cart.size());
  }
}

package com.course.task35;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task35Test {

  private List<Product> sample() {
    return new ArrayList<>(Arrays.asList(
        new Product("Banana", 5000L, 3),
        new Product("Apple", 3000L, 5),
        new Product("Cherry", 4000L, 4)));
  }

  @Test
  void byPrice_sortsAscending() {
    List<Product> sorted = new Task35().byPrice(sample());
    assertEquals(3000L, sorted.get(0).getPriceKopecks());
    assertEquals(4000L, sorted.get(1).getPriceKopecks());
    assertEquals(5000L, sorted.get(2).getPriceKopecks());
  }

  @Test
  void byRating_sortsDescending() {
    List<Product> sorted = new Task35().byRating(sample());
    assertEquals(5, sorted.get(0).getRating());
    assertEquals(4, sorted.get(1).getRating());
    assertEquals(3, sorted.get(2).getRating());
  }

  @Test
  void byName_sortsAlphabetically() {
    List<Product> sorted = new Task35().byName(sample());
    assertEquals("Apple", sorted.get(0).getName());
    assertEquals("Banana", sorted.get(1).getName());
    assertEquals("Cherry", sorted.get(2).getName());
  }

  @Test
  void byPrice_doesNotMutateInput() {
    List<Product> input = sample();
    List<Product> copy = new ArrayList<>(input);
    List<Product> sorted = new Task35().byPrice(input);
    assertNotSame(input, sorted);
    assertEquals(copy.get(0).getName(), input.get(0).getName());
    assertEquals(copy.get(1).getName(), input.get(1).getName());
    assertEquals(copy.get(2).getName(), input.get(2).getName());
  }

  @Test
  void byRating_doesNotMutateInput() {
    List<Product> input = sample();
    List<Product> copy = new ArrayList<>(input);
    new Task35().byRating(input);
    assertEquals(copy.get(0).getRating(), input.get(0).getRating());
    assertEquals(copy.get(1).getRating(), input.get(1).getRating());
    assertEquals(copy.get(2).getRating(), input.get(2).getRating());
  }

  @Test
  void byName_returnsNewListInstance() {
    List<Product> input = sample();
    List<Product> sorted = new Task35().byName(input);
    assertNotSame(input, sorted);
  }

  @Test
  void byPrice_handlesEmptyInput() {
    List<Product> sorted = new Task35().byPrice(new ArrayList<>());
    assertEquals(0, sorted.size());
  }
}

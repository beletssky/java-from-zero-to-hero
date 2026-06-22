package com.course.task34;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task34Test {

  @Test
  void compareTo_returnsNegative_whenThisAgeIsLess() {
    User younger = new User("A", 20);
    User older = new User("B", 30);
    assertTrue(younger.compareTo(older) < 0);
  }

  @Test
  void compareTo_returnsPositive_whenThisAgeIsGreater() {
    User younger = new User("A", 20);
    User older = new User("B", 30);
    assertTrue(older.compareTo(younger) > 0);
  }

  @Test
  void compareTo_returnsZero_whenAgesAreEqual() {
    User a = new User("A", 25);
    User b = new User("B", 25);
    assertEquals(0, a.compareTo(b));
  }

  @Test
  void sortUsers_sortsAscendingByAge() {
    List<User> users = new ArrayList<>(Arrays.asList(
        new User("Charlie", 40),
        new User("Alice", 20),
        new User("Bob", 30)));
    new Task34().sortUsers(users);
    assertEquals(20, users.get(0).getAge());
    assertEquals(30, users.get(1).getAge());
    assertEquals(40, users.get(2).getAge());
  }

  @Test
  void sortUsers_keepsSingleElementList() {
    List<User> users = new ArrayList<>(List.of(new User("Solo", 42)));
    new Task34().sortUsers(users);
    assertEquals(1, users.size());
    assertEquals(42, users.get(0).getAge());
  }

  @Test
  void sortUsers_handlesEmptyList() {
    List<User> users = new ArrayList<>();
    new Task34().sortUsers(users);
    assertEquals(0, users.size());
  }

  @Test
  void getters_returnConstructorValues() {
    User u = new User("Neo", 33);
    assertEquals("Neo", u.getName());
    assertEquals(33, u.getAge());
  }
}

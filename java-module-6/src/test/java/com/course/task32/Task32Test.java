package com.course.task32;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Task32Test {

  @Test
  void emptyCollectionReturnsEmptyMessage() {
    Task32 t = new Task32();
    assertEquals("Collection is empty", t.describe(new ArrayList<>()));
  }

  @Test
  void singleElementList() {
    Task32 t = new Task32();
    List<String> list = new ArrayList<>();
    list.add("only");
    assertEquals("Collection size=1, items: [only]", t.describe(list));
  }

  @Test
  void multipleElementsListPreservesOrder() {
    Task32 t = new Task32();
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    assertEquals("Collection size=3, items: [a, b, c]", t.describe(list));
  }

  @Test
  void worksForLinkedHashSet() {
    Task32 t = new Task32();
    Set<String> set = new LinkedHashSet<>();
    set.add("x");
    set.add("y");
    assertEquals("Collection size=2, items: [x, y]", t.describe(set));
  }

  @Test
  void worksForEmptySet() {
    Task32 t = new Task32();
    assertEquals("Collection is empty", t.describe(new LinkedHashSet<>()));
  }

  @Test
  void handlesDuplicatesInList() {
    Task32 t = new Task32();
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("a");
    list.add("b");
    assertEquals("Collection size=3, items: [a, a, b]", t.describe(list));
  }
}

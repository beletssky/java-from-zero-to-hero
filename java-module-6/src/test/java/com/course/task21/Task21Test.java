package com.course.task21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Task21Test {

  @Test
  void addAndFindReturnsStoredPhone() {
    Task21 book = new Task21();
    book.add("Alice", "+1-111");
    assertEquals("+1-111", book.find("Alice"));
  }

  @Test
  void findReturnsNullForUnknownName() {
    Task21 book = new Task21();
    assertNull(book.find("Ghost"));
  }

  @Test
  void removeByNameDeletesEntry() {
    Task21 book = new Task21();
    book.add("Bob", "+2-222");
    book.removeByName("Bob");
    assertNull(book.find("Bob"));
  }

  @Test
  void findByPhoneReturnsMatchingName() {
    Task21 book = new Task21();
    book.add("Alice", "+1-111");
    book.add("Bob", "+2-222");
    assertEquals("Bob", book.findByPhone("+2-222"));
  }

  @Test
  void findByPhoneReturnsNullWhenNotFound() {
    Task21 book = new Task21();
    book.add("Alice", "+1-111");
    assertNull(book.findByPhone("+9-999"));
  }

  @Test
  void addOverridesExistingPhone() {
    Task21 book = new Task21();
    book.add("Alice", "+1-111");
    book.add("Alice", "+1-222");
    assertEquals("+1-222", book.find("Alice"));
  }
}

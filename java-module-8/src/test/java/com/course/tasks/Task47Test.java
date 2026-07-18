package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Task47Test {

  @Test
  void uniqueWords_lowercasesAndDeduplicatesAndSorts() {
    assertEquals(
        List.of("hello", "there", "world"),
        Task47.uniqueWords(List.of("hello world", "Hello there")));
  }

  @Test
  void uniqueWords_returnsEmptyListForEmptyInput() {
    assertEquals(List.of(), Task47.uniqueWords(List.of()));
  }

  @Test
  void uniqueWords_handlesSingleSentenceWithSingleWord() {
    assertEquals(List.of("apple"), Task47.uniqueWords(List.of("apple")));
  }

  @Test
  void uniqueWords_filtersEmptyTokensFromLeadingAndTrailingSpaces() {
    assertEquals(
        List.of("a", "b", "c"),
        Task47.uniqueWords(List.of("  a b  ", "b c")));
  }

  @Test
  void uniqueWords_handlesMultipleWhitespaceBetweenWords() {
    assertEquals(
        List.of("one", "three", "two"),
        Task47.uniqueWords(List.of("one   two", "two\tthree")));
  }

  @Test
  void uniqueWords_isCaseInsensitiveForDeduplication() {
    assertEquals(
        List.of("java", "kotlin"),
        Task47.uniqueWords(List.of("Java JAVA java", "Kotlin kotlin")));
  }
}

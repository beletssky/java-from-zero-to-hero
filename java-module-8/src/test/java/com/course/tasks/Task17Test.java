package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class Task17Test {

  @Test
  void returnsLengthWhenNamePresent() {
    assertEquals(Optional.of(4), Task17.nameLength(Optional.of("Anna")));
  }

  @Test
  void returnsEmptyWhenNameAbsent() {
    assertTrue(Task17.nameLength(Optional.empty()).isEmpty());
  }

  @Test
  void returnsZeroWhenNameIsEmptyString() {
    assertEquals(Optional.of(0), Task17.nameLength(Optional.of("")));
  }

  @Test
  void returnsLengthForSingleCharacterName() {
    assertEquals(Optional.of(1), Task17.nameLength(Optional.of("A")));
  }

  @Test
  void returnsLengthForLongName() {
    assertEquals(Optional.of(11), Task17.nameLength(Optional.of("Alexandrina")));
  }

  @Test
  void countsSpacesInsideName() {
    assertEquals(Optional.of(9), Task17.nameLength(Optional.of("John Doe ")));
  }
}

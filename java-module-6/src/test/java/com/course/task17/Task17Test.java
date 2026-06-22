package com.course.task17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.Test;

class Task17Test {

  @Test
  void blockAndIsBlockedReturnsTrue() {
    Task17 bl = new Task17();
    bl.block("a@b.com");
    assertTrue(bl.isBlocked("a@b.com"));
  }

  @Test
  void isBlockedReturnsFalseForUnknownEmail() {
    Task17 bl = new Task17();
    bl.block("a@b.com");
    assertFalse(bl.isBlocked("other@b.com"));
  }

  @Test
  void unblockRemovesEmail() {
    Task17 bl = new Task17();
    bl.block("a@b.com");
    bl.unblock("a@b.com");
    assertFalse(bl.isBlocked("a@b.com"));
  }

  @Test
  void unblockMissingDoesNotThrow() {
    Task17 bl = new Task17();
    bl.unblock("never@b.com");
    assertFalse(bl.isBlocked("never@b.com"));
  }

  @Test
  void blockingSameEmailTwiceKeepsSingleEntry() {
    Task17 bl = new Task17();
    bl.block("a@b.com");
    bl.block("a@b.com");
    assertEquals(1, bl.allBlocked().size());
  }

  @Test
  void allBlockedReturnsCopy() {
    Task17 bl = new Task17();
    bl.block("a@b.com");
    bl.block("c@d.com");
    Set<String> snapshot = bl.allBlocked();
    snapshot.clear();
    assertTrue(bl.isBlocked("a@b.com"));
    assertTrue(bl.isBlocked("c@d.com"));
  }

  @Test
  void allBlockedContainsBlockedEmails() {
    Task17 bl = new Task17();
    bl.block("a@b.com");
    bl.block("c@d.com");
    assertEquals(Set.of("a@b.com", "c@d.com"), bl.allBlocked());
  }
}

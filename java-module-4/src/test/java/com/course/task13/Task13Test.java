package com.course.task13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task13Test {

  @Test
  void parentLoggerAddsInfoPrefix() {
    Logger l = new Logger();
    assertEquals("[INFO] hello", l.log("hello"));
  }

  @Test
  void timestampLoggerAddsTimestampAndInfoPrefix() {
    TimestampLogger tl = new TimestampLogger();
    assertEquals("1234ms: [INFO] hello", tl.log("hello"));
  }

  @Test
  void timestampLoggerUsesSuperCall() {
    TimestampLogger tl = new TimestampLogger();
    assertEquals("1234ms: [INFO] error", tl.log("error"));
  }

  @Test
  void polymorphismViaParentReference() {
    Logger l = new TimestampLogger();
    assertEquals("1234ms: [INFO] msg", l.log("msg"));
  }

  @Test
  void timestampLoggerContainsParentResult() {
    Logger parent = new Logger();
    TimestampLogger child = new TimestampLogger();
    String parentResult = parent.log("data");
    assertTrue(child.log("data").contains(parentResult));
  }
}

package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Task02Test {

  private final PrintStream originalOut = System.out;
  private ByteArrayOutputStream baos;

  @BeforeEach
  void redirectStdout() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos, true, StandardCharsets.UTF_8));
  }

  @AfterEach
  void restoreStdout() {
    System.setOut(originalOut);
  }

  @Test
  void printsGreetingWithGivenName() {
    Task02.greeter("Ivan").run();
    String printed = baos.toString(StandardCharsets.UTF_8).trim();
    assertEquals("Привет, Ivan!", printed);
  }

  @Test
  void printsGreetingForAnotherName() {
    Task02.greeter("Мария").run();
    String printed = baos.toString(StandardCharsets.UTF_8).trim();
    assertEquals("Привет, Мария!", printed);
  }

  @Test
  void printsGreetingForEmptyName() {
    Task02.greeter("").run();
    String printed = baos.toString(StandardCharsets.UTF_8).trim();
    assertEquals("Привет, !", printed);
  }

  @Test
  void factoryReturnsNonNullRunnable() {
    assertNotNull(Task02.greeter("X"));
  }

  @Test
  void runningTwiceProducesTwoLines() {
    Runnable r = Task02.greeter("Bob");
    r.run();
    r.run();
    String printed = baos.toString(StandardCharsets.UTF_8);
    long lines = printed.lines().filter(l -> l.equals("Привет, Bob!")).count();
    assertEquals(2, lines);
  }
}

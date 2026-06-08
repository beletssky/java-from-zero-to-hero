package com.course.task11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task11Test {

  @Test
  void parentGreetingReturnsHelloName() {
    Greeting g = new Greeting();
    assertEquals("Hello, Alice", g.say("Alice"));
  }

  @Test
  void loudGreetingReturnsUpperCase() {
    LoudGreeting loud = new LoudGreeting();
    assertEquals("HELLO, ALICE", loud.say("Alice"));
  }

  @Test
  void loudGreetingUsesSuperCallChain() {
    LoudGreeting loud = new LoudGreeting();
    assertEquals("HELLO, BOB", loud.say("Bob"));
  }

  @Test
  void polymorphismViaParentReference() {
    Greeting g = new LoudGreeting();
    assertEquals("HELLO, CHARLIE", g.say("Charlie"));
  }

  @Test
  void parentAndChildProduceDifferentResults() {
    Greeting parent = new Greeting();
    Greeting child = new LoudGreeting();
    assertNotEquals(parent.say("Dan"), child.say("Dan"));
  }
}

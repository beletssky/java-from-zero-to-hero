package com.course.task15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task15Test {

  @Test
  void aLevelIsOne() {
    A a = new A();
    assertEquals(1, a.level());
  }

  @Test
  void bLevelIsEleven() {
    B b = new B();
    assertEquals(11, b.level());
  }

  @Test
  void cLevelIsOneHundredEleven() {
    C c = new C();
    assertEquals(111, c.level());
  }

  @Test
  void polymorphismParentReferenceReturnsSubclassValue() {
    A x = new C();
    assertEquals(111, x.level());
  }

  @Test
  void bReferenceToCReturnsCValue() {
    B y = new C();
    assertEquals(111, y.level());
  }
}

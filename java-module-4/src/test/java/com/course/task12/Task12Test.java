package com.course.task12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task12Test {

  @Test
  void parentCalculatorAddsTwoNumbers() {
    Calculator c = new Calculator();
    assertEquals(5.0, c.compute(2.0, 3.0), 1e-9);
  }

  @Test
  void scientificCalculatorDoublesSum() {
    ScientificCalculator sc = new ScientificCalculator();
    assertEquals(10.0, sc.compute(2.0, 3.0), 1e-9);
  }

  @Test
  void scientificCalculatorUsesSuperCall() {
    ScientificCalculator sc = new ScientificCalculator();
    assertEquals(20.0, sc.compute(4.0, 6.0), 1e-9);
  }

  @Test
  void polymorphismViaParentReference() {
    Calculator c = new ScientificCalculator();
    assertEquals(14.0, c.compute(3.0, 4.0), 1e-9);
  }

  @Test
  void scientificDoublesParentResult() {
    Calculator parent = new Calculator();
    ScientificCalculator child = new ScientificCalculator();
    assertEquals(parent.compute(1.5, 2.5) * 2.0, child.compute(1.5, 2.5), 1e-9);
  }
}

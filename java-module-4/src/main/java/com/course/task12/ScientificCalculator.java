package com.course.task12;

/**
 * Научный калькулятор.
 * Удваивает результат родительского сложения.
 */
public class ScientificCalculator extends Calculator {

  @Override
  public double compute(double a, double b) {
    return super.compute(a, b) * 2;
  }
}

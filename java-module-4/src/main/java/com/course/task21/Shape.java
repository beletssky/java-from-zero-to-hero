package com.course.task21;

/**
 * Абстрактная геометрическая фигура.
 * Хранит цвет и определяет контракт вычисления площади.
 */
public abstract class Shape {
  protected String color;

  public Shape(String color) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public String getColor() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public abstract double area();
}

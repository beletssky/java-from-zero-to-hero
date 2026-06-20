package com.course.task21;

/**
 * Абстрактная геометрическая фигура.
 * Хранит цвет и определяет контракт вычисления площади.
 */
public abstract class Shape {
  protected String color;

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public abstract double area();
}

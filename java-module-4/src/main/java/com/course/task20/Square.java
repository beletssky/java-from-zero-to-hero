package com.course.task20;

/**
 * Квадрат.
 * Вычисляет площадь как side * side.
 */
public class Square extends Shape {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  @Override
  public double area() {
    return side * side;
  }
}

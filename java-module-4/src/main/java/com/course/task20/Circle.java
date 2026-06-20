package com.course.task20;

/**
 * Круг.
 * Вычисляет площадь по формуле PI * r * r.
 */
public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}

package com.course.task20;

/**
 * Утилита для работы с фигурами.
 * Через instanceof возвращает радиус для круга или сторону для квадрата.
 */
public class ShapeUtil {

  public double getRadiusOrSide(Shape s) {
    if (s instanceof Circle c) return c.getRadius();
    if (s instanceof Square sq) return sq.getSide();
    return -1.0;
  }
}
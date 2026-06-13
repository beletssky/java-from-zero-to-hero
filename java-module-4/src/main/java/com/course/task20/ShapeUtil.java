package com.course.task20;

/**
 * Утилита для работы с фигурами.
 * Через instanceof возвращает радиус для круга или сторону для квадрата.
 */
public class ShapeUtil {

  public double getRadiusOrSide(Shape s) {
    if (s instanceof Circle circle){
      return circle.getRadius();
    }
    if (s instanceof Square square){
      return square.getSide();
  }
    return -1;
}
}

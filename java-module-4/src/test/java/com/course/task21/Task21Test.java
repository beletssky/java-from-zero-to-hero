package com.course.task21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

  @Test
  void circleConstructorAndColorGetter() {
    Circle c = new Circle("red", 2.0);
    assertEquals("red", c.getColor());
  }

  @Test
  void circleRadiusGetter() {
    Circle c = new Circle("blue", 3.5);
    assertEquals(3.5, c.getRadius(), 1e-9);
  }

  @Test
  void circleAreaReturnsPiTimesRadiusSquared() {
    Circle c = new Circle("green", 2.0);
    assertEquals(Math.PI * 4.0, c.area(), 1e-9);
  }

  @Test
  void rectangleConstructorAndGetters() {
    Rectangle r = new Rectangle("yellow", 3.0, 4.0);
    assertEquals("yellow", r.getColor());
    assertEquals(3.0, r.getWidth(), 1e-9);
    assertEquals(4.0, r.getHeight(), 1e-9);
  }

  @Test
  void rectangleAreaReturnsWidthTimesHeight() {
    Rectangle r = new Rectangle("black", 5.0, 6.0);
    assertEquals(30.0, r.area(), 1e-9);
  }

  @Test
  void polymorphicShapeReferenceCallsCorrectArea() {
    Shape s1 = new Circle("red", 1.0);
    Shape s2 = new Rectangle("blue", 2.0, 3.0);
    assertEquals(Math.PI, s1.area(), 1e-9);
    assertEquals(6.0, s2.area(), 1e-9);
  }
}

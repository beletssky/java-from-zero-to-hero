package com.course.task20;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task20Test {

  @Test
  void parentShapeReturnsZeroArea() {
    Shape s = new Shape();
    assertEquals(0.0, s.area(), 1e-9);
  }

  @Test
  void circleAreaIsPiTimesRadiusSquared() {
    Circle c = new Circle(2.0);
    assertEquals(Math.PI * 4.0, c.area(), 1e-9);
    assertEquals(2.0, c.getRadius(), 1e-9);
  }

  @Test
  void squareAreaIsSideSquared() {
    Square sq = new Square(3.0);
    assertEquals(9.0, sq.area(), 1e-9);
    assertEquals(3.0, sq.getSide(), 1e-9);
  }

  @Test
  void polymorphismViaParentReference() {
    Shape s = new Circle(1.0);
    assertEquals(Math.PI, s.area(), 1e-9);
    Shape t = new Square(4.0);
    assertEquals(16.0, t.area(), 1e-9);
  }

  @Test
  void shapeUtilReturnsRadiusForCircleSideForSquareMinusOneOtherwise() {
    ShapeUtil util = new ShapeUtil();
    assertEquals(5.0, util.getRadiusOrSide(new Circle(5.0)), 1e-9);
    assertEquals(7.0, util.getRadiusOrSide(new Square(7.0)), 1e-9);
    assertEquals(-1.0, util.getRadiusOrSide(new Shape()), 1e-9);
  }
}

package com.course.task25;

/**
 * Шахматы — игра на двоих.
 */
public class Chess extends Game {

  public Chess() {
    super(2);
  }

  @Override
  public String start() {
    return "Chess started";
  }
}

package com.course.task25;

/**
 * Шашки — игра на двоих.
 */
public class Checkers extends Game {

  public Checkers() {
    super(2);
  }

  @Override
  public String start() {
    return "Checkers started";
  }
}

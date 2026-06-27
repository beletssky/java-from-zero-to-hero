package com.course.task15;

/**
 * Финальный класс цепочки наследования.
 * Прибавляет 100 к уровню родителя.
 */
public class C extends B {

  @Override
  public int level() {
    return super.level() + 100;
  }
}

package com.course.task14;

/**
 * Базовый валидатор.
 * Считает строку валидной, если она не null и не пуста.
 */
public class BaseValidator {

  public boolean validate(String s) {
    if (s == null || s.isEmpty()){
      return false;
    }
      return true;
  }
}

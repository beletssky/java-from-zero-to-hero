package com.course.task14;

/**
 * Валидатор email-адресов.
 * Дополнительно требует наличия символа '@' в строке.
 */
public class EmailValidator extends BaseValidator {

  @Override
  public boolean validate(String s) {
    if (s != null && s.contains("@")){
      return super.validate(s);
    }
    return false;
  }
}

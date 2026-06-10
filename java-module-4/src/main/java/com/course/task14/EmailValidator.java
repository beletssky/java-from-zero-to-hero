package com.course.task14;

/**
 * Валидатор email-адресов.
 * Дополнительно требует наличия символа '@' в строке.
 */
public class EmailValidator extends BaseValidator {

    @Override
    public boolean validate(String s) {
        // TODO: реализуй
        return super.validate(s) && s.contains("@");
    }
}

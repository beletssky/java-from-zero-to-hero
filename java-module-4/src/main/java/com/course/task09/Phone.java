package com.course.task09;

/**
 * Телефон с номером.
 * Умеет совершать звонок.
 */
public class Phone {

    protected String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String call() {
        return "calling " + number;
    }
}

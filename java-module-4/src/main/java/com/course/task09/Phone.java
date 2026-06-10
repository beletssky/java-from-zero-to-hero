package com.course.task09;

/**
 * Телефон с номером.
 * Умеет совершать звонок.
 */
public class Phone {

    protected String number;

    public Phone(String number) {
        // TODO: реализуй
        this.number = number;
    }

    public String getNumber() {
        // TODO: реализуй
        return this.number;
    }

    public String call() {
        // TODO: реализуй
        return "calling " + number;
    }
}

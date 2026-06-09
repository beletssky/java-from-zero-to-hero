package com.course.task09;

/**
 * Смартфон — подкласс Phone.
 * Дополнительно умеет запускать приложения.
 */
public class Smartphone extends Phone {

    private String osName;

    public Smartphone(String number, String osName) {
        super(number);
        // TODO: реализуй
        this.osName = osName;
    }

    public String getOsName() {
        // TODO: реализуй
        return this.osName;
    }

    public String runApp(String app) {
        // TODO: реализуй
        return "WhatsApp running on " + osName;
    }
}

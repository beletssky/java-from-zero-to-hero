package com.course.task09;

/**
 * Смартфон — подкласс Phone.
 * Дополнительно умеет запускать приложения.
 */
public class Smartphone extends Phone {

    private String osName;

    public Smartphone(String number, String osName) {
        super(number);
        this.osName = osName;
    }

    public String getOsName() {
        return osName;
    }

    public String runApp(String app) {
        return app + " running on " + osName;
    }
}

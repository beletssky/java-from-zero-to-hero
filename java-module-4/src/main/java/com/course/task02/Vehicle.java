package com.course.task02;

/**
 * Базовый класс транспортного средства.
 * Хранит марку и год выпуска.
 */
public class Vehicle {

    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String describe() {
        return brand + " " + year;
    }
}

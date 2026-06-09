package com.course.task02;

/**
 * Базовый класс транспортного средства.
 * Хранит марку и год выпуска.
 */
public class Vehicle {

    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        // TODO: реализуй
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        // TODO: реализуй
        return this.brand;
    }

    public int getYear() {
        // TODO: реализуй
        return this.year;
    }

    public String describe() {
        // TODO: реализуй
        return brand + " " + year;
    }
}

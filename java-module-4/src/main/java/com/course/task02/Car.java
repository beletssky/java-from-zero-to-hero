package com.course.task02;

/**
 * Автомобиль — подкласс Vehicle.
 * Добавляет количество мест и расширяет описание.
 */
public class Car extends Vehicle {

    private int seats;

    public Car(String brand, int year, int seats) {
        super(brand, year);
        // TODO: реализуй
        this.seats = seats;
    }

    public int getSeats() {
        // TODO: реализуй
        return this.seats;
    }

    @Override
    public String describe() {
        // TODO: реализуй
        return brand + " " + year + ", " + seats + " seats";
    }
}

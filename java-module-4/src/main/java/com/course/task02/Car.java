package com.course.task02;

/**
 * Автомобиль — подкласс Vehicle.
 * Добавляет количество мест и расширяет описание.
 */
public class Car extends Vehicle {

    private int seats;

    public Car(String brand, int year, int seats) {
        super(brand, year);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String describe() {
        return brand + " " + year + ", " + seats + " seats";
    }
}

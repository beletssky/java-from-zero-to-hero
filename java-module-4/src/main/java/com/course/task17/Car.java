package com.course.task17;

/**
 * Автомобиль — транспортное средство с числом мест.
 * Дописывает информацию о местах к строковому представлению родителя.
 */
public class Car extends Vehicle {

  private int seats;

  public Car(String brand, int year, int seats) {
    super(brand, year);
    this.seats = seats;
  }

  @Override
  public String toString() {
    return super.toString() + ", seats=" + seats;
  }
}

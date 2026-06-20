package com.course.task17;

/**
 * Транспортное средство.
 * Хранит марку и год выпуска.
 */
public class Vehicle {

  protected String brand;
  protected int year;

  public Vehicle(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  @Override
  public String toString() {
    return "Vehicle{" + "brand=" + brand + ", year=" + year + "}";
  }
}

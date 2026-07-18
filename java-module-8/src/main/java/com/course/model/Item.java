package com.course.model;

import java.util.Objects;

/**
 * Неизменяемая модель товара: имя и цена.
 */
public final class Item {

  private final String name;
  private final double price;

  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Item other)) return false;
    return Double.compare(price, other.price) == 0
        && Objects.equals(name, other.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  @Override
  public String toString() {
    return "Item{name='" + name + "', price=" + price + '}';
  }
}

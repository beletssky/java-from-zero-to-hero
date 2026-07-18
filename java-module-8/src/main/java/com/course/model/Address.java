package com.course.model;

import java.util.Objects;

/**
 * Неизменяемая модель адреса: только город. Поле {@code city} может быть {@code null}.
 */
public final class Address {

  private final String city;

  public Address(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Address other)) return false;
    return Objects.equals(city, other.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city);
  }

  @Override
  public String toString() {
    return "Address{city='" + city + "'}";
  }
}

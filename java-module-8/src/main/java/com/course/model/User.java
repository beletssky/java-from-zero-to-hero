package com.course.model;

import java.util.Objects;

/**
 * Неизменяемая модель пользователя: имя и адрес. Поле {@code address} может быть {@code null}.
 */
public final class User {

  private final String name;
  private final Address address;

  public User(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public Address getAddress() {
    return address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User other)) return false;
    return Objects.equals(name, other.name)
        && Objects.equals(address, other.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address);
  }

  @Override
  public String toString() {
    return "User{name='" + name + "', address=" + address + '}';
  }
}

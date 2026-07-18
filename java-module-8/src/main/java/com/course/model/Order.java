package com.course.model;

import java.util.List;
import java.util.Objects;

/**
 * Неизменяемая модель заказа: идентификатор, имя покупателя и список товаров.
 * Список товаров копируется через {@link List#copyOf}.
 */
public final class Order {

  private final int id;
  private final String customer;
  private final List<Item> items;

  public Order(int id, String customer, List<Item> items) {
    this.id = id;
    this.customer = customer;
    this.items = List.copyOf(items);
  }

  public int getId() {
    return id;
  }

  public String getCustomer() {
    return customer;
  }

  public List<Item> getItems() {
    return items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Order other)) return false;
    return id == other.id
        && Objects.equals(customer, other.customer)
        && Objects.equals(items, other.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, items);
  }

  @Override
  public String toString() {
    return "Order{id=" + id + ", customer='" + customer + "', items=" + items + '}';
  }
}

package com.course.task35;

import java.util.Objects;

/**
 * Товар с именем, ценой (в копейках) и рейтингом.
 * Хранит цену в long, чтобы избежать ошибок арифметики с плавающей точкой.
 */
public class Product {

  private String name;
  private long priceKopecks;
  private int rating;

  public Product(String name, long priceKopecks, int rating) {
    this.name = name;
    this.priceKopecks = priceKopecks;
    this.rating =  rating;
  }

  public String getName() {
    return name;
  }

  public long getPriceKopecks() {
    return priceKopecks;
  }

  public int getRating() {
    return rating;
  }

  @Override
  public boolean equals(Object o) {
   if (this == o) {
     return true;
   }
   if (o == null || getClass() != o.getClass()) {
     return false;
   }
    Product product = (Product) o;
   return priceKopecks == product.priceKopecks && rating == product.rating && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, priceKopecks, rating);
  }

  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", priceKopecks=" + priceKopecks +
            ", rating=" + rating +
            '}';
  }
}

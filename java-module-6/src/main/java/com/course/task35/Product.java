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
        // TODO: реализуй
        this.name = name;
        this.priceKopecks = priceKopecks;
        this.rating = rating;
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public long getPriceKopecks() {
        // TODO: реализуй
        return priceKopecks;
    }

    public int getRating() {
        // TODO: реализуй
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return this.name.equals(product.name)
                && this.priceKopecks == product.priceKopecks
                && this.rating == product.rating;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(name, priceKopecks, rating);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Product name: " + name + ", prrice: " + priceKopecks + ", rating: " + rating;
    }
}

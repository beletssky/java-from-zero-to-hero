package com.course.task03;

/**
 * Товар корзины с именем и ценой в копейках.
 * Используется в {@link Task03} для расчёта итога.
 */
public class Item {

  private String name;
  private long priceKopecks;

  public Item(String name, long priceKopecks) {
    this.name = name;
    this.priceKopecks = priceKopecks;
  }

  public String getName() {
    return name;
  }

  public long getPriceKopecks() {
    return priceKopecks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Item item = (Item) o;
    if (priceKopecks != item.priceKopecks) return false;
    return name != null ? name.equals(item.name) : item.name == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (int) (priceKopecks ^ (priceKopecks >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "Item{name='" + name + "', priceKopecks=" + priceKopecks + "}";
  }
}
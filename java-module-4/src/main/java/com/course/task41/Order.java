package com.course.task41;

/**
 * Заказ с идентификатором и текущим статусом.
 * Метод advance() продвигает заказ по жизненному циклу.
 */
public class Order {
    private long id;
    private OrderStatus status;

    public Order(long id, OrderStatus status) {
        // TODO: реализуй
        this.id = id;
        this.status = status;
    }

    public long getId() {
        // TODO: реализуй
        return id;
    }

    public OrderStatus getStatus() {
        // TODO: реализуй
        return status;
    }

    public void advance() {
        // TODO: реализуй
        switch (this.status) {
            case NEW -> this.status = OrderStatus.PROCESSING;
            case PROCESSING -> this.status = OrderStatus.SHIPPED;
            case SHIPPED -> this.status = OrderStatus.DELIVERED;
            case DELIVERED, CANCELLED -> throw new IllegalStateException();
        }
    }
}

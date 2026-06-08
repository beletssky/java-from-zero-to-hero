package com.course.task41;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task41Test {

    @Test
    void constructorAndGettersWork() {
        Order order = new Order(42L, OrderStatus.NEW);
        assertEquals(42L, order.getId());
        assertEquals(OrderStatus.NEW, order.getStatus());
    }

    @Test
    void advanceFromNewMovesToProcessing() {
        Order order = new Order(1L, OrderStatus.NEW);
        order.advance();
        assertEquals(OrderStatus.PROCESSING, order.getStatus());
    }

    @Test
    void advanceChainsThroughToDelivered() {
        Order order = new Order(1L, OrderStatus.NEW);
        order.advance();
        assertEquals(OrderStatus.PROCESSING, order.getStatus());
        order.advance();
        assertEquals(OrderStatus.SHIPPED, order.getStatus());
        order.advance();
        assertEquals(OrderStatus.DELIVERED, order.getStatus());
    }

    @Test
    void advanceOnDeliveredThrowsIllegalStateException() {
        Order order = new Order(1L, OrderStatus.DELIVERED);
        assertThrows(IllegalStateException.class, order::advance);
    }

    @Test
    void advanceOnCancelledThrowsIllegalStateException() {
        Order order = new Order(1L, OrderStatus.CANCELLED);
        assertThrows(IllegalStateException.class, order::advance);
    }
}

package com.course.task41;

/**
 * Перечисление статусов заказа.
 * Определяет жизненный цикл заказа от создания до доставки или отмены.
 */
public enum OrderStatus {
    NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}

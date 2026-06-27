package com.course.task40;

/**
 * Обобщённый контракт репозитория.
 * Методы используют сырой Object — параметр T объявлен по требованию задачи.
 */

public interface Repository<T> {
    Object findById(int id);
    void save(Object item);
}

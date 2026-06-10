package com.course.task40;

/**
 * Базовый репозиторий с готовой реализацией findById.
 * Метод save оставлен абстрактным — реализуется в наследниках.
 */
public abstract class BaseRepository implements Repository<Object> {
    protected Object[] items = new Object[100];

    @Override
    public Object findById(int id) {
        // TODO: реализуй
        if (id >= 0 && id < items.length) {
            return items[id];
        }
        return null;
    }

    @Override
    public abstract void save(Object item);
}

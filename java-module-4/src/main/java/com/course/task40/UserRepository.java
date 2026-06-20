package com.course.task40;

/**
 * Репозиторий пользователей.
 * Сохраняет User по его id в массив items.
 */
public class UserRepository extends BaseRepository {

    @Override
    public void save(Object item) {
        User user = (User) item;
        items[user.getId()] = user;
    }
}

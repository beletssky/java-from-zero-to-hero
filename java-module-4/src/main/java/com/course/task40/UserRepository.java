package com.course.task40;

/**
 * Репозиторий пользователей.
 * Сохраняет User по его id в массив items.
 */
public class UserRepository extends BaseRepository {

    @Override
    public void save(Object item) {
        // TODO: реализуй
        if (item instanceof User user) {
            int id = user.getId();
            if (id >= 0 && id < items.length) {
                items[id] = user;
            }
        }
    }
}

package com.course.task10;

/**
 * Пользователь системы с именем.
 * По умолчанию не может удалять сущности.
 */
public class User {

    protected String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public boolean canDelete() {
        return false;
    }
}

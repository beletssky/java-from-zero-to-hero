package com.course.task10;

/**
 * Пользователь системы с именем.
 * По умолчанию не может удалять сущности.
 */
public class User {

    protected String username;

    public User(String username) {
        // TODO: реализуй
        this.username = username;
    }

    public String getUsername() {
        // TODO: реализуй
        return this.username;
    }

    public boolean canDelete() {
        // TODO: реализуй
        return false;
    }
}

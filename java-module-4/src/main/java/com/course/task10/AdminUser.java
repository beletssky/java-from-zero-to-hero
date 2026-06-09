package com.course.task10;

/**
 * Администратор — подкласс User.
 * Может удалять и банить других пользователей.
 */
public class AdminUser extends User {

    public AdminUser(String username) {
        super(username);
        // TODO: реализуй
    }

    @Override
    public boolean canDelete() {
        // TODO: реализуй
        return true;
    }

    public String ban(User u) {
        // TODO: реализуй
        return u.username + " banned by " + username;
    }
}

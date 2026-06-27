package com.course.task10;

/**
 * Администратор — подкласс User.
 * Может удалять и банить других пользователей.
 */
public class AdminUser extends User {

    public AdminUser(String username) {
        super(username);
    }

    @Override
    public boolean canDelete() {
        return true;
    }

    public String ban(User u) {
        return "User " + u.getUsername() + " is banned";
    }
}

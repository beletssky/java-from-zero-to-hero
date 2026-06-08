package com.course.task10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void userConstructorSetsUsername() {
        User u = new User("alice");
        assertEquals("alice", u.getUsername());
    }

    @Test
    void userCannotDeleteByDefault() {
        User u = new User("alice");
        assertFalse(u.canDelete());
    }

    @Test
    void adminUserConstructorSetsUsername() {
        AdminUser admin = new AdminUser("root");
        assertEquals("root", admin.getUsername());
    }

    @Test
    void adminUserCanDelete() {
        AdminUser admin = new AdminUser("root");
        assertTrue(admin.canDelete());
    }

    @Test
    void adminBanFormatsMessageCorrectly() {
        AdminUser admin = new AdminUser("root");
        User victim = new User("bob");
        assertEquals("bob banned by root", admin.ban(victim));
    }

    @Test
    void polymorphicReferenceCallsOverriddenCanDelete() {
        User u = new AdminUser("root");
        assertTrue(u.canDelete());
    }
}

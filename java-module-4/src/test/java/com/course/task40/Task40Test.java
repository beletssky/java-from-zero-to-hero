package com.course.task40;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task40Test {

    @Test
    void savedUserShouldBeFoundById() {
        UserRepository repo = new UserRepository();
        User alice = new User(5, "Alice");
        repo.save(alice);
        Object found = repo.findById(5);
        assertSame(alice, found);
    }

    @Test
    void findByIdShouldReturnNullForMissingId() {
        UserRepository repo = new UserRepository();
        assertNull(repo.findById(99));
    }

    @Test
    void polymorphismThroughRepositoryInterface() {
        Repository<Object> r = new UserRepository();
        User bob = new User(7, "Bob");
        r.save(bob);
        assertSame(bob, r.findById(7));
    }

    @Test
    void userGettersShouldReturnConstructorValues() {
        User u = new User(3, "Carol");
        assertEquals(3, u.getId());
        assertEquals("Carol", u.getName());
    }

    @Test
    void multipleUsersShouldBeStoredIndependently() {
        UserRepository repo = new UserRepository();
        User a = new User(1, "Alice");
        User b = new User(2, "Bob");
        repo.save(a);
        repo.save(b);
        assertSame(a, repo.findById(1));
        assertSame(b, repo.findById(2));
    }

    @Test
    void polymorphismThroughBaseRepositoryReference() {
        BaseRepository base = new UserRepository();
        User u = new User(10, "Dave");
        base.save(u);
        assertSame(u, base.findById(10));
    }
}
//
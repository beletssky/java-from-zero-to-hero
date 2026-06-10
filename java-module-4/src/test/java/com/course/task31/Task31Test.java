package com.course.task31;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task31Test {

    @Test
    void documentGetContentReturnsConstructorArgument() {
        Document d = new Document("hello");
        assertEquals("hello", d.getContent());
    }

    @Test
    void documentSaveReturnsFormattedString() {
        Document d = new Document("hello");
        assertEquals("saving 'hello'", d.save());
    }

    @Test
    void documentLoadReturnsContent() {
        Document d = new Document("hello");
        assertEquals("hello", d.load());
    }

    @Test
    void documentAsSaveable() {
        Saveable s = new Document("data");
        assertEquals("saving 'data'", s.save());
    }

    @Test
    void documentAsLoadable() {
        Loadable l = new Document("data");
        assertEquals("data", l.load());
    }
}

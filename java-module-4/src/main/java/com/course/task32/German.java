package com.course.task32;

/**
 * Немецкий Greeter; переопределяет default greet() на немецкое приветствие.
 */
public class German implements Greeter {
    @Override
    public String name() {
        return "Hans";
    }

    @Override
    public String greet() {
        return "Hallo, " + name();
    }
}

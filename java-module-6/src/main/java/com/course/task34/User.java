package com.course.task34;

/**
 * Пользователь с именем и возрастом.
 * Реализует естественное упорядочение по возрасту (по возрастанию).
 */
public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        // TODO: реализуй
        this.name = name;
        this.age = age;
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public int getAge() {
        // TODO: реализуй
        return age;
    }

    @Override
    public int compareTo(User other) {
        // TODO: реализуй
        if (other == null) {
            return 1;
        }
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "User name: " + name + ", age: " + age;
    }
}

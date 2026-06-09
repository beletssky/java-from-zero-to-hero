package com.course.task15;

/**
 * Промежуточный класс цепочки наследования.
 * Прибавляет 10 к уровню родителя.
 */
public class B extends A {

    @Override
    public int level() {
        // TODO: реализуй
        return super.level() + 10;
    }
}

package com.course.task35;

/**
 * Реализация стека на массиве int[] фиксированной ёмкости 100.
 */
public class IntStack implements SimpleStack {
    private int[] data = new int[100];
    private int top = 0;

    @Override
    public void push(int x) {
        data[top] = x;
        top++;
    }

    @Override
    public int pop() {
        top--;
        return data[top];
    }

    @Override
    public int peek() {
        return data[top - 1];
    }

    @Override
    public int size() {
        return top;
    }
}

package com.course.tasks;

public class Task16 {

    /**
     * Простой калькулятор. op ∈ {'+', '-', '*', '/'}.
     * При op == '/' и b == 0 — ArithmeticException("div by zero").
     * Любой другой op — IllegalArgumentException("unknown op").
     * Реализовать через switch.
     */
    public static double calculate(double a, double b, char op) {
        switch (op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b==0){
                    throw new ArithmeticException("div by zero");
                }
                return a/b;
            default:
                throw new IllegalArgumentException("unknown op");
        }
    }
}

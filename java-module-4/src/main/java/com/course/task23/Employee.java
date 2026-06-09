package com.course.task23;

/**
 * Абстрактный сотрудник.
 * Определяет контракт расчёта месячной зарплаты.
 */
public abstract class Employee {
    protected String name;
    protected long baseSalary;

    public Employee(String name, long baseSalary) {
        // TODO: реализуй
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public long getBaseSalary() {
        // TODO: реализуй
        return baseSalary;
    }

    public abstract long getMonthlyPay();
}

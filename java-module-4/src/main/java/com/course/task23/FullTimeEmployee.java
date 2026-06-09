package com.course.task23;

/**
 * Сотрудник на полной ставке — получает baseSalary в месяц.
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, long baseSalary) {
        super(name, baseSalary);
        // TODO: реализуй
    }

    @Override
    public long getMonthlyPay() {
        // TODO: реализуй
        return baseSalary;
    }
}

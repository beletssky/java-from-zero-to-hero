package com.course.task23;

/**
 * Сотрудник на почасовой оплате.
 */
public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private long hourlyRate;

    public PartTimeEmployee(String name, long baseSalary, int hoursWorked, long hourlyRate) {
        super(name, baseSalary);
        // TODO: реализуй
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        // TODO: реализуй
        return hoursWorked;
    }

    public long getHourlyRate() {
        // TODO: реализуй
        return hourlyRate;
    }

    @Override
    public long getMonthlyPay() {
        // TODO: реализуй
        return hourlyRate * hoursWorked;
    }
}

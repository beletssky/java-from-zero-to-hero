package com.course.task23;

/**
 * Сотрудник на почасовой оплате.
 */
public class PartTimeEmployee extends Employee {
  private int hoursWorked;
  private long hourlyRate;

  public PartTimeEmployee(String name, long baseSalary, int hoursWorked, long hourlyRate) {
    super(name, baseSalary);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  public int getHoursWorked() {
    return hoursWorked;
  }

  public long getHourlyRate() {
    return hourlyRate;
  }

  @Override
  public long getMonthlyPay() {
    return hourlyRate * hoursWorked;
  }
}

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
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public int getHoursWorked() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public long getHourlyRate() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  @Override
  public long getMonthlyPay() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}

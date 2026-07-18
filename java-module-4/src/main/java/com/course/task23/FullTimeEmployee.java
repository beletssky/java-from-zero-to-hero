package com.course.task23;

/**
 * Сотрудник на полной ставке — получает baseSalary в месяц.
 */
public class FullTimeEmployee extends Employee {

  public FullTimeEmployee(String name, long baseSalary) {
    super(name, baseSalary);
  }

  @Override
  public long getMonthlyPay() {
    return baseSalary;
  }
}

package com.course.task23;

/**
 * Абстрактный сотрудник.
 * Определяет контракт расчёта месячной зарплаты.
 */
public abstract class Employee {
  protected String name;
  protected long baseSalary;

  public Employee(String name, long baseSalary) {
    this.name = name;
    this.baseSalary = baseSalary;
  }

  public String getName() {
    return name;
  }

  public long getBaseSalary() {
    return baseSalary;
  }

  public abstract long getMonthlyPay();
}

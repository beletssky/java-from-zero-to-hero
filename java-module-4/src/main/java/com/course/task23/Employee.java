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
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public String getName() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public long getBaseSalary() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public abstract long getMonthlyPay();
}

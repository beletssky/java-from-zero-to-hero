package com.course.task06;

/**
 * Менеджер — подкласс Employee.
 * Знает размер своей команды и общую стоимость.
 */
public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, long salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public long getTotalCost() {
        return salary + teamSize * 1000L;
    }
}

package com.course.task06;

/**
 * Менеджер — подкласс Employee.
 * Знает размер своей команды и общую стоимость.
 */
public class Manager extends Employee {

    private int teamSize;

    private static final long COST_PER_TEAM_MEMBER = 1000;

    public Manager(String name, long salary, int teamSize) {
        super(name, salary);
        // TODO: реализуй
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        // TODO: реализуй
        return this.teamSize;
    }

    public long getTotalCost() {
        // TODO: реализуй
        return getSalary() + teamSize * COST_PER_TEAM_MEMBER;
    }
}

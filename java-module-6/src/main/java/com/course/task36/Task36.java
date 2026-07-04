package com.course.task36;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Задача 36: сортировка сотрудников по двум полям.
 * Сначала по отделу по возрастанию, затем по зарплате по убыванию внутри отдела.
 */
public class Task36 {

    public List<Employee> sort(List<Employee> input) {
        // TODO: реализуй
        List<Employee> result = new ArrayList<>(input);
        result.sort(
                Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Comparator.comparingLong(Employee::getSalary).reversed())
        );

        return result;
    }
}

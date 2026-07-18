package com.course.task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Статистика по списку чисел.
 * Поддерживает сумму, среднее, максимум и минимум.
 */
public class Task02 {

    private List<Integer> nums = new ArrayList<>();

    public void add(int n) {
        // TODO: реализуй
        nums.add(n);
    }

    public int sum() {
        // TODO: реализуй
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    public double average() {
        // TODO: реализуй
        return nums.isEmpty() ? 0.0 : (double) sum() / nums.size();
    }

    public int max() {
        // TODO: реализуй
        return Collections.max(nums);
    }

    public int min() {
        // TODO: реализуй
        return Collections.min(nums);
    }
}

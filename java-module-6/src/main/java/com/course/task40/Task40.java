package com.course.task40;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Расширенные операции над множествами: симметрическая разность,
 * проверка подмножества и декартово произведение.
 */
public class Task40 {

    private Set<Integer> a;
    private Set<Integer> b;

    public Task40(Set<Integer> a, Set<Integer> b) {
        this.a = new HashSet<>(a);
        this.b = new HashSet<>(b);
    }

    public Set<Integer> symmetricDifference() {
        // TODO: реализуй
        Set<Integer> diff1 = new HashSet<>(a);
        diff1.removeAll(b);

        Set<Integer> diff2 = new HashSet<>(b);
        diff2.removeAll(a);

        diff1.addAll(diff2);
        return diff1;
    }

    public boolean isSubset(Set<Integer> small, Set<Integer> big) {
        // TODO: реализуй
        if (small == null || big == null) {
            return false;
        }
        return big.containsAll(small);
    }

    public Set<List<Integer>> cartesianProduct(Set<Integer> x, Set<Integer> y) {
        // TODO: реализуй
        Set<List<Integer>> result = new HashSet<>();

        if (x == null || y == null || x.isEmpty() || y.isEmpty()) {
            return result;
        }

        for (Integer elementX : x) {
            for (Integer elementY : y) {
                List<Integer> pair = List.of(elementX, elementY);
                result.add(pair);
            }
        }

        return result;
    }
}

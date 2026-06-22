package com.course.task40;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task40Test {

    @Test
    void symmetricDifferenceWithOverlappingSets() {
        Task40 task = new Task40(Set.of(1, 2, 3), Set.of(2, 3, 4));

        Set<Integer> result = task.symmetricDifference();

        assertEquals(Set.of(1, 4), result);
    }

    @Test
    void symmetricDifferenceOfDisjointSetsIsUnion() {
        Task40 task = new Task40(Set.of(1, 2), Set.of(3, 4));

        Set<Integer> result = task.symmetricDifference();

        assertEquals(Set.of(1, 2, 3, 4), result);
    }

    @Test
    void isSubsetReturnsTrueForActualSubset() {
        Task40 task = new Task40(Set.of(), Set.of());

        assertTrue(task.isSubset(Set.of(1, 2), Set.of(1, 2, 3)));
    }

    @Test
    void isSubsetReturnsFalseWhenElementMissing() {
        Task40 task = new Task40(Set.of(), Set.of());

        assertFalse(task.isSubset(Set.of(1, 4), Set.of(1, 2, 3)));
    }

    @Test
    void isSubsetOfEmptySetIsTrue() {
        Task40 task = new Task40(Set.of(), Set.of());

        assertTrue(task.isSubset(Collections.emptySet(), Set.of(1, 2, 3)));
        assertTrue(task.isSubset(Collections.emptySet(), Collections.emptySet()));
    }

    @Test
    void cartesianProductOfTwoSetsHasFourPairs() {
        Task40 task = new Task40(Set.of(), Set.of());

        Set<List<Integer>> result = task.cartesianProduct(Set.of(1, 2), Set.of(3, 4));

        assertEquals(4, result.size());
        assertTrue(result.contains(List.of(1, 3)));
        assertTrue(result.contains(List.of(1, 4)));
        assertTrue(result.contains(List.of(2, 3)));
        assertTrue(result.contains(List.of(2, 4)));
    }

    @Test
    void cartesianProductWithEmptySetIsEmpty() {
        Task40 task = new Task40(Set.of(), Set.of());

        Set<List<Integer>> result = task.cartesianProduct(Collections.emptySet(), Set.of(1, 2));

        assertTrue(result.isEmpty());
    }
}

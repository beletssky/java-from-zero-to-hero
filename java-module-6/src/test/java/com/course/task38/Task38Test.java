package com.course.task38;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task38Test {

    @Test
    void findReturnsIdsForSingleDocumentWord() {
        Task38 index = new Task38();
        index.addDocument(1, "alpha beta gamma");

        Set<Integer> result = index.find("alpha");

        assertEquals(Set.of(1), result);
    }

    @Test
    void findReturnsAllIdsForOverlappingWord() {
        Task38 index = new Task38();
        index.addDocument(1, "alpha beta");
        index.addDocument(2, "beta gamma");
        index.addDocument(3, "delta beta");

        Set<Integer> result = index.find("beta");

        assertEquals(Set.of(1, 2, 3), result);
    }

    @Test
    void findReturnsCorrectIdsForUniqueWord() {
        Task38 index = new Task38();
        index.addDocument(1, "alpha beta");
        index.addDocument(2, "gamma delta");

        Set<Integer> result = index.find("gamma");

        assertEquals(Set.of(2), result);
    }

    @Test
    void findOnUnknownWordReturnsEmptySet() {
        Task38 index = new Task38();
        index.addDocument(1, "alpha beta");

        Set<Integer> result = index.find("missing");

        assertTrue(result.isEmpty());
    }

    @Test
    void findOnEmptyIndexReturnsEmptySet() {
        Task38 index = new Task38();

        Set<Integer> result = index.find("anything");

        assertTrue(result.isEmpty());
    }

    @Test
    void addDocumentHandlesMultipleWhitespace() {
        Task38 index = new Task38();
        index.addDocument(7, "alpha   beta\tgamma");

        assertEquals(Set.of(7), index.find("alpha"));
        assertEquals(Set.of(7), index.find("beta"));
        assertEquals(Set.of(7), index.find("gamma"));
    }
}

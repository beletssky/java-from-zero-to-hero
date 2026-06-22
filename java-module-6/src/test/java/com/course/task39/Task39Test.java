package com.course.task39;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task39Test {

    @Test
    void firstVoteSucceedsAndIsCounted() {
        Task39 system = new Task39();

        system.vote("user1", "Alice");

        assertEquals(Integer.valueOf(1), system.results().get("Alice"));
    }

    @Test
    void sameUserVotingTwiceThrows() {
        Task39 system = new Task39();
        system.vote("user1", "Alice");

        assertThrows(IllegalStateException.class, () -> system.vote("user1", "Bob"));
    }

    @Test
    void voteCountIncrementsAcrossDifferentUsers() {
        Task39 system = new Task39();
        system.vote("user1", "Alice");
        system.vote("user2", "Alice");
        system.vote("user3", "Alice");

        assertEquals(Integer.valueOf(3), system.results().get("Alice"));
    }

    @Test
    void winnerIsCandidateWithMaxVotes() {
        Task39 system = new Task39();
        system.vote("u1", "Alice");
        system.vote("u2", "Bob");
        system.vote("u3", "Bob");
        system.vote("u4", "Charlie");

        assertEquals("Bob", system.winner());
    }

    @Test
    void winnerOnEmptyVotesIsNull() {
        Task39 system = new Task39();

        assertNull(system.winner());
    }

    @Test
    void resultsAreSortedByCandidateName() {
        Task39 system = new Task39();
        system.vote("u1", "Charlie");
        system.vote("u2", "Alice");
        system.vote("u3", "Bob");

        TreeMap<String, Integer> results = system.results();

        assertEquals("Alice", results.firstKey());
        assertEquals("Charlie", results.lastKey());
    }
}

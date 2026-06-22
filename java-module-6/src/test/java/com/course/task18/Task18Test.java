package com.course.task18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Task18Test {

  @Test
  void firstVoteReturnsTrue() {
    Task18 reg = new Task18();
    assertTrue(reg.vote("user-1"));
  }

  @Test
  void secondVoteByTheSameUserReturnsFalse() {
    Task18 reg = new Task18();
    reg.vote("user-1");
    assertFalse(reg.vote("user-1"));
  }

  @Test
  void duplicateVoteDoesNotIncreaseCount() {
    Task18 reg = new Task18();
    reg.vote("user-1");
    reg.vote("user-1");
    assertEquals(1, reg.count());
  }

  @Test
  void hasVotedReturnsTrueAfterVoting() {
    Task18 reg = new Task18();
    reg.vote("user-1");
    assertTrue(reg.hasVoted("user-1"));
  }

  @Test
  void hasVotedReturnsFalseForUnknownUser() {
    Task18 reg = new Task18();
    reg.vote("user-1");
    assertFalse(reg.hasVoted("user-2"));
  }

  @Test
  void countMatchesNumberOfDistinctVoters() {
    Task18 reg = new Task18();
    reg.vote("a");
    reg.vote("b");
    reg.vote("c");
    reg.vote("a");
    assertEquals(3, reg.count());
  }

  @Test
  void initialCountIsZero() {
    Task18 reg = new Task18();
    assertEquals(0, reg.count());
  }
}

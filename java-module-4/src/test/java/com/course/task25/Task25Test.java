package com.course.task25;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task25Test {

  @Test
  void chessHasTwoPlayers() {
    Chess c = new Chess();
    assertEquals(2, c.getPlayers());
  }

  @Test
  void checkersHasTwoPlayers() {
    Checkers c = new Checkers();
    assertEquals(2, c.getPlayers());
  }

  @Test
  void chessStartReturnsExpectedString() {
    Chess c = new Chess();
    assertEquals("Chess started", c.start());
  }

  @Test
  void checkersStartReturnsExpectedString() {
    Checkers c = new Checkers();
    assertEquals("Checkers started", c.start());
  }

  @Test
  void infoReturnsPlayerCountForBothGames() {
    Game g1 = new Chess();
    Game g2 = new Checkers();
    assertEquals("Game for 2 players", g1.info());
    assertEquals("Game for 2 players", g2.info());
  }

  @Test
  void polymorphicGameReferenceCallsCorrectStart() {
    Game g = new Chess();
    assertEquals("Chess started", g.start());
    g = new Checkers();
    assertEquals("Checkers started", g.start());
  }
}

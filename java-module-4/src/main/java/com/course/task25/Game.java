package com.course.task25;

/**
 * Абстрактная игра.
 * Хранит число игроков и определяет контракт старта.
 */
public abstract class Game {
  protected int players;

  public Game(int players) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public int getPlayers() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public abstract String start();

  public String info() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}

package com.course.task25;

/**
 * Абстрактная игра.
 * Хранит число игроков и определяет контракт старта.
 */
public abstract class Game {
  protected int players;

  public Game(int players) {
    this.players = players;
  }

  public int getPlayers() {
    return players;
  }

  public abstract String start();

  public String info() {
    return "Game for " + players + " players";
  }
}

package com.course.task25;

/**
 * Абстрактная игра.
 * Хранит число игроков и определяет контракт старта.
 */
public abstract class Game {
    protected int players;

    public Game(int players) {
        // TODO: реализуй
        this.players = players;
    }

    public int getPlayers() {
        // TODO: реализуй
        return players;
    }

    public abstract String start();

    public String info() {
        // TODO: реализуй
        return "Game for " + players + " players";
    }
}

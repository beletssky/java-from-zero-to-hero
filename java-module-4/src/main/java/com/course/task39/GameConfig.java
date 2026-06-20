package com.course.task39;

/**
 * Конфигурация игры — utility-класс с приватным конструктором.
 * Содержит константы и статический метод для получения информации.
 */
public class GameConfig {

    public static final int MAX_PLAYERS = 100;
    public static final String VERSION = "1.0";

    private GameConfig() {
    }

    public static String getInfo() {
        return  "Version " + VERSION + ", max " + MAX_PLAYERS + " players";
    }
}

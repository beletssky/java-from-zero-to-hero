package com.course.tasks;

public class Task18 {

    /**
     * Возвращает действие на сигнале светофора:
     * "red" → "stop"; "yellow" → "slow"; "green" → "go"; иначе → "wait".
     * Не чувствителен к регистру. Реализовать через switch.
     */
    public static String trafficLightAction(String color) {
        if (color == null) {
            return "wait";
        }
        return switch (color.toLowerCase()) {
            case "red" -> "stop";
            case "yellow" -> "slow";
            case "green" -> "go";
            default -> "wait";

        };
    }
}

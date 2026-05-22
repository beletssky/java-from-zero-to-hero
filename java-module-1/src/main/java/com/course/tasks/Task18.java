package com.course.tasks;

public class Task18 {
    public static String trafficLightAction(String color) {
        switch (color) {
            case "Red":
                return "Stop";
            case "Yellow":
                return "Slow";
            case "Green":
                return "Go";
            default:
                return "Wait";
        }
    }
}

/**
 * Возвращает действие на сигнале светофора:
 * "red" → "stop"; "yellow" → "slow"; "green" → "go"; иначе → "wait".
 * Не чувствителен к регистру. Реализовать через switch.
 */
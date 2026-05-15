package com.course.tasks;

public class Task18 {

    /**
     * Возвращает действие на сигнале светофора:
     * "red" → "stop"; "yellow" → "slow"; "green" → "go"; иначе → "wait".
     * Не чувствителен к регистру. Реализовать через switch.
     */
    public static String trafficLightAction(String color) {
        switch (color.toLowerCase()){
            case "red":
                return "stop";
            case "yellow":
                return "slow";
            case "green":
                return "go";
            default:
                return "wait";
        }
    }
}

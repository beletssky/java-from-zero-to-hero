package com.course.tasks;

public class Task45 {

    /**
     * Делает первую букву после каждой точки (и в начале строки) заглавной.
     * Между точкой и буквой может быть один или несколько пробелов.
     * Остальные символы не меняются.
     * <p>UA: Робить першу літеру після кожної крапки (і на початку рядка) великою.
     * Між крапкою та літерою може бути один або декілька пробілів.
     * Інші символи не змінюються.
     * Примеры: capitalizeAfterDots("hello. how are you. fine.") ==
     * "Hello. How are you. Fine."; capitalizeAfterDots("") == "".
     */
    public static String capitalizeAfterDots(String s) {
        // TODO: реализуй
        if (s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        boolean capitalizeNext = true;

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (currentChar == '.') {
                capitalizeNext = true;
            } else if (currentChar == ' ') continue;
            else if (capitalizeNext) {
                char newChar = Character.toUpperCase(currentChar);
                sb.setCharAt(i, newChar);
                capitalizeNext = false;

            }
        }
        return sb.toString();
    }
}

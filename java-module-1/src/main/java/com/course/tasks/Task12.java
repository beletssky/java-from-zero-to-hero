package com.course.tasks;

public class Task12 {

    /**
     * Возвращает true, если age &gt;= 18 И isCitizen == true.
     * Примеры: canVote(20, true) == true; canVote(17, true) == false.
     */
    public static boolean canVote(int age, boolean isCitizen) {
        return age >= 18 && isCitizen;
    }
}

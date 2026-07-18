package com.course.tasks;

public class Task12 {
    /**
     * Возвращает true, если age &gt;= 18 И isCitizen == true.
     * Примеры: canVote(20, true) == true; canVote(17, true) == false.
     */
    public static boolean canVote(int age, boolean isCitizen) {
        if (age>=18) {
            if (isCitizen==true){
                return true;
            }
            return false;
        }
        return false;
    }
}
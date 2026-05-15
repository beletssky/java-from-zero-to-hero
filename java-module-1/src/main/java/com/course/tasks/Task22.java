package com.course.tasks;

public class Task22 {

    /**
     * Возвращает количество цифр в |n|.
     * Примеры: countDigits(0) == 1; countDigits(123) == 3; countDigits(-45) == 2.
     */
    public static int countDigits(int n) {
        if(n==Integer.MIN_VALUE){
            n=Integer.MAX_VALUE;
        }
        if (n<0){
            n=n*-1;
        }
        String n1 = String.valueOf(n);
        return n1.length();

    }
}

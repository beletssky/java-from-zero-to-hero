package com.course.tasks;

public class Task26 {

    /**
     * Возводит base в степень exp без использования Math.pow.
     * Для exp &lt; 0 — IllegalArgumentException.
     * Примеры: power(2, 10) == 1024L; power(3, 0) == 1L; power(5, 1) == 5L.
     */
    public static long power(int base, int exp) {
        if (exp<0){
            throw new IllegalArgumentException();
        }
        if (exp==0){
            return 1;
        }
        if (exp==1){
            return base;
        }
        int i=1;
        long result = base;
        while (i<exp){
            result = base * result;
            i++;
        }
        return result;
    }
}

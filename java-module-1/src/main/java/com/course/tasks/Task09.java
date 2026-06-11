package com.course.tasks;

public class Task09 {

    /**
     * Возвращает -1, если n &lt; 0; 0, если n == 0; 1, если n &gt; 0.
     * Примеры: sign(-7) == -1; sign(0) == 0.
     */
    public static int sign(int n) {
        if (n < 0){
            return -1;
        } else if (n == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
}

package com.course.tasks;

public class Task13 {

    /**
     * Возвращает true, если из сторон a, b, c можно построить треугольник:
     * все стороны &gt; 0 и сумма любых двух сторон больше третьей.
     * Примеры: isTriangle(3, 4, 5) == true; isTriangle(1, 1, 5) == false.
     */
    public static boolean isTriangle(int a, int b, int c) {
        if (a<=0){
            return false;
        }
        if (b<=0){
            return false;
        }
        if (c<=0){
            return false;
        }
        if (a+b>c){
            if (a+c>b){
                if (c+b>a){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

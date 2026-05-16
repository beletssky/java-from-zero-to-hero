package com.course.tasks;

public class Task25 {

    /**
     * Возвращает true, если n — простое число.
     * Примеры: isPrime(2) == true; isPrime(15) == false; isPrime(1) == false; isPrime(-7) == false.
     */
    public static boolean isPrime(int n) {

        boolean result = true;

        if (n<=1){
            return false;
        }

        int [] divisor = {2, 3, 5};
        if (n == 2 || n == 3 || n == 5 || n == 7) {
            return result;
        }

        for (int i = 0; i < divisor.length; i++){
            int i1 = n % divisor[i];

            if (i1==0){
                result = false;
                break;
            }
        }

        return result;
    }

//    public static boolean isPrime (int n) {
//
//        if (n < 2) {
//            return false;
//        }
//
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}

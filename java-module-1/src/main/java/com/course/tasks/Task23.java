package com.course.tasks;

public class Task23 {

    /**
     * Возвращает сумму цифр |n|.
     * Примеры: sumOfDigits(123) == 6; sumOfDigits(-405) == 9; sumOfDigits(0) == 0.
     */
    public static int sumOfDigits(int n) {

        String numberString = Integer.toString(n);

        if (n<0){

            numberString = numberString.substring(1);

        }

        char[] charArray = numberString.toCharArray();

        int result = 0;

        for (int i = 0; i < charArray.length; i++) {
            result = result + Character.getNumericValue(charArray[i]);
        }

//        for(char a : charArray) {
//            result += Character.getNumericValue(a);
//        }

        return result;
    }
}

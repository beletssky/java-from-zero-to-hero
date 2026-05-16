package com.course.tasks;

public class Task24 {

    /**
     * Возвращает число, у которого цифры идут в обратном порядке. Знак сохраняется.
     * Примеры: reverseNumber(123) == 321; reverseNumber(-450) == -54; reverseNumber(0) == 0.
     */
    public static int reverseNumber(int n) {

        String number = String.valueOf(n);

        char[] charArray = number.toCharArray();

        char[] charArrayReversed = new char[charArray.length];

        int j = 0;

        for (int i = charArray.length - 1; i >= 0;) {

            if (j == charArray.length){
                break;
            }

            if(charArray[0] == '-' && j == 0) {
                charArrayReversed[j] = charArray[0];

                j++;

                continue;
            }

            charArrayReversed[j] = charArray[i];

            i--;

            j++;
        }
        String reversedNumber = String.valueOf(charArrayReversed);
        int reversedInteger = Integer.parseInt(reversedNumber);


        return reversedInteger;
    }
}

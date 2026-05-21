package com.course.tasks;

public class Task19 {

    /**
     * Возвращает строку, перевёрнутую посимвольно. Использовать StringBuilder или цикл.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: reverseString("hello") == "olleh"; reverseString("") == "".
     */
    public static String reverseString(String s) {
        if (s == null){
            throw new IllegalArgumentException();
        }
        char[] inputArray = s.toCharArray();
        char[] outputArray = new char[inputArray.length];
        int j = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++){
        outputArray[j] = inputArray[i];
        j--;
        }
        return String.valueOf(outputArray);
    }
}

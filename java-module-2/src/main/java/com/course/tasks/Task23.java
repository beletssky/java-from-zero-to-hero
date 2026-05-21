package com.course.tasks;

public class Task23 {

    /**
     * Возвращает строку без гласных латинских букв (a, e, i, o, u — в любом регистре).
     * Примеры: removeVowels("Hello World") == "Hll Wrld";
     *          removeVowels("AEIOU") == "".
     */
    public static String removeVowels(String s) {
        char[] aeiou = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] input = s.toCharArray();
        char[] output = new char[input.length];
        int x = 0;
        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < aeiou.length; j++){
                if (aeiou[j] == input[i]) {
                    break;
                }
                if (j == aeiou.length - 1){
                    output[x] = input[i];
                    x++;
                }
            }
        }

        return String.valueOf(output).substring(0, x);
    }
}

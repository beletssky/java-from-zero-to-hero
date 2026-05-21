package com.course.tasks;

public class Task22 {

    /**
     * Возвращает количество слов в строке (разделители — один или несколько пробелов).
     * Примеры: countWords("hello world") == 2;
     *          countWords("  one  two  three  ") == 3;
     *          countWords("") == 0; countWords("   ") == 0.
     */
    public static int countWords(String s) {
        // сплит строки через пробел, проверить на бланк, посчитать не бланк
        String[] splited = s.split(" ");
        int lenghtString = splited.length;
        for (int i = 0; i < splited.length; i++){
            if (splited[i].equals("")){
                lenghtString--;
            }
        }
        return lenghtString;
    }
}

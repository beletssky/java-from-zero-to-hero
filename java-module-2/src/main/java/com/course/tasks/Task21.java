package com.course.tasks;

public class Task21 {

    /**
     * Возвращает строку, где каждое слово начинается с заглавной буквы,
     * а остальные буквы — строчные. Слова разделены пробелами.
     * Примеры: toTitleCase("hello world") == "Hello World";
     *          toTitleCase("java is cool") == "Java Is Cool";
     *          toTitleCase("") == "".
     */
    public static String toTitleCase(String s) {
        if (s.isEmpty()){
            return s;
        }

        String[] divided = s.split(" ");
        StringBuilder finaleResult = new StringBuilder();

        for (int i = 0; i < divided.length; i++){

            char [] index = divided[i].toLowerCase().toCharArray();

            index[0] = Character.toUpperCase(index[0]);

            String upperCased = String.valueOf(index);

            finaleResult.append(upperCased).append(" ");
        }
    return finaleResult.toString().trim();
    }
}

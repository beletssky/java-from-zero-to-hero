package com.course.tasks;

import java.util.Arrays;

public class Task18 {

    /**
     * Возвращает количество вхождений символа c в строку s.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: countChar("hello", 'l') == 2; countChar("", 'a') == 0.
     */
    public static int countChar(String s, char c) {

        if (s == null){
            throw new IllegalArgumentException();
        }

        char [] dobryDzien = s.toCharArray();
        int j = 0;

        for (int i = 0; i < dobryDzien.length; i++){
            if (dobryDzien[i] == c ){
                j++;
            };
        }

        return j;
    }
}

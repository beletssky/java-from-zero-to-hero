package com.course.tasks;

import java.util.ArrayDeque;

public class Task35 {

    /**
     * Проверяет корректность скобок в строке. Поддерживать (), [], {}.
     * Другие символы игнорировать. Использовать char[] как стек или java.util.ArrayDeque.
     * Примеры: isValidBrackets("()") == true; isValidBrackets("([])") == true;
     * isValidBrackets("([)]") == false; isValidBrackets("(((") == false;
     * isValidBrackets("") == true; isValidBrackets("abc(d)e") == true.
     */
    public static boolean isValidBrackets(String s) {
        // TODO: реализуй
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();

                if (ch == ')' && openBracket != '(') return false;
                if (ch == ']' && openBracket != '[') return false;
                if (ch == '}' && openBracket != '{') return false;
            }

        }
        return stack.isEmpty();
    }
}

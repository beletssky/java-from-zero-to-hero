package com.course.tasks;

public class Task14 {

    /**
     * Возвращает короткое название дня недели:
     * 1→"Пн", 2→"Вт", 3→"Ср", 4→"Чт", 5→"Пт", 6→"Сб", 7→"Вс".
     * Иначе — "?". Реализовать через switch.
     */
    public static String dayName(int n) {
        switch (n){
            case 1:
                 return "Пн";
            case 2:
                 return "Вт";
            case 3:
                 return "Ср";
            case 4:
                 return "Чт";
            case 5:
                 return "Пт";
            case 6:
                 return "Сб";
            case 7:
                 return "Вс";
            default:
                 return "?";


        }
    }
}

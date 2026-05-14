package com.course.tasks;

public class Task11 {

    /**
     * По баллу 0..100 возвращает букву оценки:
     * 90+ → 'A', 75+ → 'B', 60+ → 'C', 50+ → 'D', меньше — 'F'.
     * Если score &lt; 0 или &gt; 100 — IllegalArgumentException.
     */
    public static char gradeLetter(int score) {
       if (score<0){
           throw new IllegalArgumentException("ты шо, какое отрицательное?!");
       }
       if (score>100) {
           throw new IllegalArgumentException("больше сотки? красава, пшёл нахер!");
       }
       if (score>=50){
           if(score>=60){
               if(score>=75){
                   if(score>=90){
                       return 'A';
                   }
                   return 'B';
               }
               return 'C';
           }
           return 'D';
       }
       return 'F';
    }
}

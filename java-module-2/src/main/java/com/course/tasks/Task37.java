package com.course.tasks;

public class Task37 {

    /**
     * Возвращает строку с описанием числа в формате:
     * "n=&lt;n&gt;, sign=&lt;positive|negative|zero&gt;, parity=&lt;even|odd&gt;, digits=&lt;count&gt;".
     * digits — количество цифр в |n| (для 0 равно 1). parity определяется по n.
     * <p>UA: Повертає рядок з описом числа у форматі:
     * "n=&lt;n&gt;, sign=&lt;positive|negative|zero&gt;, parity=&lt;even|odd&gt;, digits=&lt;count&gt;".
     * digits — кількість цифр у |n| (для 0 дорівнює 1). parity визначається за n.
     * Примеры: describeNumber(42) == "n=42, sign=positive, parity=even, digits=2";
     * describeNumber(-105) == "n=-105, sign=negative, parity=odd, digits=3";
     * describeNumber(0) == "n=0, sign=zero, parity=even, digits=1".
     */
    public static String describeNumber(int n) {
        // TODO: реализуй
        String sign;
        if (n > 0) {
            sign = "positive";
        } else if (n < 0) {
            sign = "negative";
        } else {
            sign = "zero";
        }
        String parity = (n % 2 == 0) ? "even" : "odd";
        int digits = String.valueOf(Math.abs((long) n)).length();

        return "n=" + n +
                ", sign=" + sign +
                ", parity=" + parity +
                ", digits=" + digits;
    }
}

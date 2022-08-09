package com.tasks.task3;

/**
 * Задача 69: Программа приводит boolean данные
 * к строковым данным и снова переводит в boolean данные.
 */
public class Task31 {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a + " " + b);

        String as = a + "";
        String bs = Boolean.toString(b);

        System.out.println(as + " " + bs);

        a = Boolean.parseBoolean(as);
        b = Boolean.valueOf(bs);

        System.out.println(a + " " + b);
    }
}

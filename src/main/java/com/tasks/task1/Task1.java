package com.tasks.task1;

/**
 * Пример 1: Выводим на экран различными способами надпись
 */
public class Task1 {

    public static void main(String[] args) {
        //Пример  1
        System.out.println("Hello world!");
        System.out.println("5 раз");

        //Пример 2
        System.out.print("Hello ");
        System.out.println("world");
        System.out.print("5 ");
        System.out.println("раз");

        //Пример 3
        String a3 = "Hello world";
        String b3 = "5 раз";
        System.out.println(a3);
        System.out.println(b3);

        //Пример 4
        String s1;
        String s2;
        String b1;
        String b2;

        s1 = "Hello ";
        s2 = "world";
        b1 = "5 ";
        b2 = "раз";
        System.out.println(s1 + s2);
        System.out.println(b1 + b2);

        //Пример 5
        String a5 = "Hello ";
        String b5 = "5 ";
        System.out.println(a5 + "world");
        System.out.println(b5 + "раз");

        //Пример 6
        String a6 = "Hello world";
        int b6 = 5;
        System.out.println(a6);
        System.out.println(b5 + "раз");

        //Пример 7
        String a7 = "Hello";
        System.out.println(a7 + " world");
        System.out.println(5 + " раз");

        //Пример 8
        int a8;
        a8 = 5;
        System.out.println("Hello world");
        System.out.println(a8 + " раз");

        //Пример 9
        int a9 = 2;
        int b9 = 3;
        System.out.println("Hello world");
        System.out.println((a9 + b9) + " раз");

        //Пример 10
        int a10 = 2;
        System.out.println("Hell world");
        System.out.println((3 + a10) + " раз");
    }
}

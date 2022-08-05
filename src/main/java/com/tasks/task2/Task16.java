package com.tasks.task2;

/**
 * Задача 28: Программа сообщает, кто сейчас дома: папа, мама или сын.
 * Ответ формируется случайным образом.
 */
public class Task16 {

    public static void main(String[] args) {
        int a = (int)(Math.random() * 2);
        int b = (int)(Math.random() * 2);
        int c = (int)(Math.random() * 2);

        String p = a == 0 ? "Папа дома" : "Папы дома нет";
        String m = b == 0 ? "Мама дома" : "Мамы дома нет";
        String s = c == 0 ? "Сын дома" : "Сына дома нет";

        System.out.println(p);
        System.out.println(m);
        System.out.println(s);
    }
}

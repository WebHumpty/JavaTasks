package com.tasks.task4;

/**
 * Задача 87:
 * Программа превращает в отдельные строки части главной строки.
 */
public class Task18 {

    public static void main(String[] args) {
        String string = "Папа дома, мама дома, сын дома, дочь дома";
        String dad = string.substring(0, 4);
        String mom = string.substring(11, 15);
        String son = string.substring(22, 25);
        String daughter = string.substring(32, 36);

        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son);
        System.out.println(daughter);
    }
}

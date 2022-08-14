package com.tasks.task4;

/**
 * Задача 88:
 * Программа выводит порядковый номер знака,
 * с которого начинаются слова: папа, мама, сын, дочь.
 */
public class Task19 {

    public static void main(String[] args) {
        String string = "Папа дома, мама дома, сын дома, дочь дома";
        int dad = string.indexOf("Папа");
        int mom = string.indexOf("мама");
        int son = string.indexOf("сын");
        int daughter = string.indexOf("дочь");

        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son);
        System.out.println(daughter);
    }
}

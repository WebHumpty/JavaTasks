package com.tasks.task4;

/**
 * Задача 89:
 * Программа меняет одни последовательности символов на другие.
 */
public class Task20 {

    public static void main(String[] args) {
        String string = "Папа дома, мама дома, сын дома, дочь дома";
        System.out.println(string);

        String s1 = string.replace("дома", "в школе");
        System.out.println(s1);

        String s2 = string.replace("сын", "Ваня");
        System.out.println(s2);

        String s3 = string.replace("дочь", "Оля");
        System.out.println(s3);
    }
}

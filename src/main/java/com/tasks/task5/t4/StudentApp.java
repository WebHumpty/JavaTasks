package com.tasks.task5.t4;

/**
 * Задача 94:
 * Программа выводит данные о студентах.
 */
public class StudentApp {

    public static void main(String[] args) {
        Student ivan = new Student();
        Student masha = new Student();

        ivan.name = "Ivan";
        ivan.surname = "Иванов";
        ivan.age = 20;
        ivan.height = 180;
        ivan.weight = 63;

        masha.name = "Маша";
        masha.surname = "Попова";
        masha.age = 19;
        masha.height = 163;
        masha.weight = 54;

        System.out.println("Студент №1");
        System.out.println("Имя: " + ivan.name);
        System.out.println("Фамилия: " + ivan.surname);
        System.out.println("Возраст: " + ivan.age);
        System.out.println("Рост: " + ivan.height);
        System.out.println("Вес: " + ivan.weight);
        System.out.println();
        System.out.println("Студент №2");
        System.out.println("Имя: " + masha.name);
        System.out.println("Фамилия: " + masha.surname);
        System.out.println("Возраст: " + masha.age);
        System.out.println("Рост: " + masha.height);
        System.out.println("Вес: " + masha.weight);
    }
}

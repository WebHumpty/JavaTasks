package com.tasks.task5.t14;

/**
 * Задача 104:
 * Вася и Аня сдают три экзамена,
 * программа выводит поздравления и средний балл каждого из учеников.
 */
public class StudentApp {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.mathematics = (int)(Math.random() * 10) + 1;
        student1.english = (int)(Math.random() * 10) + 1;
        student1.physics = (int)(Math.random() * 10) + 1;
        student1.name = "Вася";

        student1.greeting();
        student1.medium();

        Student student2 = new Student();
        student2.mathematics = (int)(Math.random() * 10) + 1;
        student2.english = (int)(Math.random() * 10) + 1;
        student2.physics = (int)(Math.random() * 10) + 1;
        student2.name = "Аня";

        student2.greeting();
        student2.medium();
    }
}

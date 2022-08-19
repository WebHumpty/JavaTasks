package com.tasks.task5.t19;

/**
 * Задача 109:
 * Программа выводит поздравления Лизе и Ивану
 * со cдачей экзамена и считает их средние баллы,
 * оценки задаются случайным образом.
 */
public class StudentApp {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Иван";
        student1.mathematics = (int)(Math.random() * 10 + 1);
        student1.english = (int)(Math.random() * 10 + 1);
        student1.physics = (int)(Math.random() * 10 + 1);

        student2.name = "Лиза";
        student2.mathematics = (int)(Math.random() * 10 + 1);
        student2.english = (int)(Math.random() * 10 + 1);
        student2.physics = (int)(Math.random() * 10 + 1);

        System.out.println(student1.greeting());
        System.out.println("Средний балл: " + student1.midleMark());

        System.out.println(student2.greeting());
        System.out.println("Средний балл: " + student2.midleMark());
    }
}

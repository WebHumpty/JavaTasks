package com.tasks.task5.t24;

import java.util.Scanner;

/**
 * Задача 114:
 * Пользователь вводит оценки студентам,
 * программа выводит сообщение в зависимости от оценки.
 */
public class StudentApp {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Иван";
        Student student2 = new Student();
        student2.name = "Вася";
        Student student3 = new Student();
        student3.name = "Оля";
        Student student4 = new Student();
        student4.name = "Петя";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оценку студенту " + student1.name);
        System.out.print("Введите число:");
        int mark1 = sc.nextInt();

        System.out.println("Введите оценку студенту " + student2.name);
        System.out.print("Введите число:");
        int mark2 = sc.nextInt();

        System.out.println("Введите оценку студенту " + student3.name);
        System.out.print("Введите число:");
        int mark3 = sc.nextInt();

        System.out.println("Введите оценку студенту " + student4.name);
        System.out.print("Введите число:");
        int mark4 = sc.nextInt();

        System.out.println(student1.gratter(mark1));
        System.out.println(student2.gratter(mark2));
        System.out.println(student3.gratter(mark3));
        System.out.println(student4.gratter(mark4));
    }
}

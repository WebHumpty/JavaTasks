package com.tasks.task5.t6;

/**
 * Задача 96:
 * Программа выводит оценки студентов за экзамен и результат,
 * оценки формируются случайным образом.
 */
public class StudentApp {

    public static void main(String[] args) {
        int mark1 = (int)(Math.random() * 10 + 1);
        int mark2 = (int)(Math.random() * 10 + 1);
        int mark3 = (int)(Math.random() * 10 + 1);

        Student ivan = new Student();
        ivan.name = "Иван ";
        ivan.mark = mark1;
        if (ivan.mark > 5) {
            ivan.result = " сдал";
        } else {
            ivan.result = " не сдал";
        }

        Student masha = new Student();
        masha.name = "Маша ";
        masha.mark = mark2;
        if (masha.mark > 5) {
            masha.result = " сдал";
        } else {
            masha.result = " не сдал";
        }

        Student petya = new Student();
        petya.name = "Петя ";
        petya.mark = mark3;
        if (petya.mark > 5) {
            petya.result = " сдал";
        } else {
            petya.result = " не сдал";
        }

        System.out.println(ivan.name + ivan.mark + ivan.result);
        System.out.println(masha.name + masha.mark + masha.result);
        System.out.println(petya.name + petya.mark + petya.result);
    }
}

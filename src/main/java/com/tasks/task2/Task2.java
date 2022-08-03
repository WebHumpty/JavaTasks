package com.tasks.task2;

/**
 * Задача 13: Ученик сдал 3 экзамена и получил три оценки по 10 бальной шкале.
 * Оценки по каждому экзамену формируются программой случайным образом.
 * Программа оценивает, как готовился ученик к сдаче каждого экзамена
 * – плохо или хорошо.
 */
public class Task2 {

    public static void main(String[] args) {
        int mathematics = (int)(Math.random() * 10);
        int physics = (int)(Math.random() * 10);
        int english = (int)(Math.random() * 10);

        if (mathematics < 5) {
            System.out.println("Плохо");
        } else {
            System.out.println("Хорошо");
        }

        if (physics < 5) {
            System.out.println("Плохо");
        } else {
            System.out.println("Хорошо");
        }

        if (english < 5) {
            System.out.println("Плохо");
        } else {
            System.out.println("Хорошо");
        }
    }
}

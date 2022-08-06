package com.tasks.task2;

/**
 * Задача 32: Ученик сдал экзамен.
 * Программа выводит результаты экзамена
 * и дает свою оценку знаниям ученика.
 * Оценка определяется программой случайным образом.
 */
public class Task20 {

    public static void main(String[] args) {
        int exam = (int)(Math.random() * 10 + 1);

        if (exam < 3) {
            System.out.println(exam + " - ужасно");
        }
        if (3 <= exam && exam < 5) {
            System.out.println(exam + " - плохо");
        }
        if (5 <= exam && exam < 7) {
            System.out.println(exam + " - удовлетворительно");
        }
        if (7 <= exam && exam < 9) {
            System.out.println(exam + " - хорошо");
        }
        if (9 <= exam && exam <= 10) {
            System.out.println(exam + " - отлично");
        }
    }
}

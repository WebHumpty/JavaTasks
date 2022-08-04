package com.tasks.task2;

/**
 * Задача 19: Ученик сдал экзамен.
 * Программа выводит результаты экзамена
 * и дает свою оценку знанию ученика.
 * Оценка определяется программой случайным образом.
 */
public class Task7 {

    public static void main(String[] args) {
        int exam = (int)(Math.random() * 10 + 1);

        if (exam < 3) {
            System.out.println(exam + " - ужасно");
        } else if (exam < 5) {
            System.out.println(exam + " - плохо");
        } else if (exam < 7) {
            System.out.println(exam + " - удовлетворительно");
        } else if (exam < 9) {
            System.out.println(exam + " - хорошо");
        } else {
            System.out.println(exam + " - отлично");
        }
    }
}

package com.tasks.task2;

/**
 * Задача 14: Спортсмен на соревнованиях стреляет три раза по трем мишеням.
 * За каждое попадание дается один балл.
 * Программа выводит результат каждого выстрела
 * и общее количество баллов спортсмена.
 * Результат каждого выстрела формируется программой случайным образом.
 */
public class Task3 {

    public static void main(String[] args) {
        int first = (int)(Math.random() * 2);
        int second = (int)(Math.random() * 2);
        int third = (int)(Math.random() * 2);
        int result = 0;

        if (first == 1) {
            System.out.println("Попал");
            result += 1;
        } else {
            System.out.println("Промахнулся");
            result += 0;
        }

        if (second == 1) {
            System.out.println("Попал");
            result += 1;
        } else {
            System.out.println("Промахнулся");
        }

        if (third == 1) {
            System.out.println("Попал");
            result += 1;
        } else {
            System.out.println("Промахнулся");
            result += 0;
        }
        System.out.println(result);
    }
}

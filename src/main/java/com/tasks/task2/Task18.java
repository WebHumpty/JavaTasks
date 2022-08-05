package com.tasks.task2;

/**
 * Задача 30: Спортсмен на соревнованиях стреляет три раза по трем мишеням.
 * За каждое попадание дается один балл.
 * Программа выводит результаты каждого выстрела
 * и общее количество баллов спортсмена.
 * Результат каждого выстрела формируется программой случайным образом.
 */
public class Task18 {

    public static void main(String[] args) {
        int first = (int)(Math.random() * 2);
        int second = (int)(Math.random() * 2);
        int third = (int)(Math.random() * 2);
        int result = 0;
        String world;

        result = first == 0 ? result + 0 : result + 1;
        world = first == 0 ? "Промахнулся" : "Попал";
        System.out.println(world);
        result = second == 0 ? result + 0 : result + 1;
        world = second == 0 ? "Промахнулся" : "Попал";
        System.out.println(world);
        result = third == 0 ? result + 0 : result + 1;
        world = third == 0 ? "Промахнулся" : "Попал";
        System.out.println(world);
        System.out.println(result);
    }
}

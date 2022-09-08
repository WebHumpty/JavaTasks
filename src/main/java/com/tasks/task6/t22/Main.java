package com.tasks.task6.t22;

/**
 * Задача 151:
 * Программа выводит три объекта с разными характеристиками,
 * заданными при вызове конструктора.
 */
public class Main {

    public static void main(String[] args) {
        Cube cube1 = new Cube(10, 20, 30, "красный");
        Cube cube2 = new Cube(100, 100, 100, "синий");
        Cube cube3 = new Cube(2, 1, 1, "зеленый");

        cube1.outCube();
        cube2.outCube();
        cube3.outCube();
    }
}

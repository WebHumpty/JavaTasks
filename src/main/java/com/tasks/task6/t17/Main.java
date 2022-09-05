package com.tasks.task6.t17;

/**
 * Задача 146:
 * Программа выводит три одинаковых объекта
 * с характеристиками, заданными в конструкторе.
 */
public class Main {

    public static void main(String[] args) {
        Cube cube1 = new Cube();
        Cube cube2 = new Cube();
        Cube cube3 = new Cube();

        cube1.outCube();
        cube2.outCube();
        cube3.outCube();
    }
}

package com.tasks.task6.t19;

/**
 * Задача 148:
 * Программа выводит три одинаковых объекта с характеристиками,
 * заданными в конструкторе. Если в конструкторе не заданы int переменные,
 * конструктор по умолчанию присваивает 0, если не заданы String переменные,
 * конструктор по умолчанию присваивает null.
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

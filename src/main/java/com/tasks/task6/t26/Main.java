package com.tasks.task6.t26;

/**
 * Задача 155:
 * Программа пробует вывести характеристики трех разных автомобилей,
 * поступивших в салон. Однако это ей не удается, т.к.
 * в конструкторе не используется ключевое слово this.
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("BMW-5", 240, 1100000, 9, "Черный");
        Car car2 = new Car("BMW-3", 180, 950000, 7, "Красный");
        Car car3 = new Car("BMW-6", 250, 1350000, 11, "Черный");

        car1.outCar();
        car2.outCar();
        car3.outCar();
    }
}

package com.tasks.task6.t10;

/**
 * Задача 139:
 * Программа выводит марку автомобиля, цену,
 * максимальную скорость и данные по страховке.
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.marks = "BMW";
        car1.cost = 90000;
        car1.maxSpeed = 220;
        Polis polis1 = new Polis();
        polis1.ser = "HK";
        polis1.nom = 2587413;
        car1.polis = polis1;

        Car car2 = new Car();
        car2.marks = "Toyota";
        car2.cost = 80000;
        car2.maxSpeed = 180;
        Polis polis2 = new Polis();
        polis2.ser = "HO";
        polis2.nom = 6547892;
        car2.polis = polis2;

        System.out.println("Авто " + car1.marks + ", цена " + car1.cost + "$");
        System.out.println("скорость " + car1.maxSpeed + " км.час, полис");
        System.out.println("серии " + car1.polis.ser + " № " + car1.polis.nom);
        System.out.println();
        System.out.println("Авто " + car2.marks + ", цена " + car2.cost + "$");
        System.out.println("скорость " + car2.maxSpeed + " км.час, полис");
        System.out.println("серии " + car2.polis.ser + " № " + car2.polis.nom);
    }
}

package com.tasks.task5.t39;

/**
 * Задача 129:
 * Программа выводит расстояние,
 * которое проезжают автомобили за 3 часа
 * по автостраде без ограничения скорости и в городе.
 */
public class Main {

    public static void main(String[] args) {
        String strHighway = " проедет по автостраде ";
        String strCity = " проедет по городу ";

        Car car1 = new Car();
        car1.name = "BMW";
        car1.maxSpeed = 220;

        Car car2 = new Car();
        car2.name = "Prius";
        car2.maxSpeed = 140;

        Car car3 = new Car();
        car3.name = "Hummer";
        car3.maxSpeed = 120;

        int hours = 3;
        System.out.println("Время " + hours + " часа.");

        System.out.println(car1.name + strHighway);
        car1.distanceOhHighway(hours);
        System.out.println(car1.name + strCity);
        Car.distanceInCity(hours);

        System.out.println(car2.name + strHighway);
        car2.distanceOhHighway(hours);
        System.out.println(car2.name + strCity);
        Car.distanceInCity(hours);

        System.out.println(car3.name + strHighway);
        car3.distanceOhHighway(hours);
        System.out.println(car3.name + strCity);
        Car.distanceInCity(hours);
    }
}

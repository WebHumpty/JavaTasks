package com.tasks.task6.t13;

/**
 * Задача 142:
 * Программа выдает сообщение в случае
 * нарушения автомобилем скорости движения.
 */
public class Main {

    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.location = "31 км Московского шоссе, ";
        camera.model = "Камера видеофиксации DRIVE2, ";
        camera.permittedSpeed = 90;

        Car car1 = new Car();
        car1.model = "Toyota";
        car1.number = "237894 XH";
        car1.speed = 88;
        camera.violation(car1);

        Car car2 = new Car();
        car2.model = "BMW";
        car2.number = "789009 HR";
        car2.speed = 120;
        camera.violation(car2);

        Car car3 = new Car();
        car3.model = "Acura";
        car3.number = "005900 XX";
        car3.speed = 101;
        camera.violation(car3);
    }
}

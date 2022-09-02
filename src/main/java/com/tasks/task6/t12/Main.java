package com.tasks.task6.t12;

/**
 * Задача 141:
 * Программа выдает сообщение в случае
 * нарушения автомобилем скорости движения.
 */
public class Main {

    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.location = "31 км Моссковского шоссе,";
        camera.model = "Камера видеофиксации DRIVE2";
        camera.permittedSpeed = 60;

        Car car1 = new Car();
        car1.model = "Toyota";
        car1.number = "2376 RY";
        car1.speed = 88;
        camera.violation(car1);

        Car car2 = new Car();
        car2.model = "BMW";
        car2.number = "8788 XK";
        car2.speed = 120;
        camera.violation(car2);

        Car car3 = new Car();
        car3.model = "Acura";
        car3.number = "0054 XX";
        car3.speed = 101;
        camera.violation(car3);
    }
}

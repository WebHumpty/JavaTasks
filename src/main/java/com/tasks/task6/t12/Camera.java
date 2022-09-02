package com.tasks.task6.t12;

public class Camera {

    String location;
    String model;
    int permittedSpeed;

    public void violation(Car car) {
        if (car.speed > permittedSpeed) {
            System.out.println("--------------------");
            System.out.println(model);
            System.out.println("установленная на " + location);
            System.out.println("засняла превышение скорости - " + car.model);
            System.out.println("гос.номер " + car.number);
            System.out.println("скорость " + car.speed + ".");
            System.out.println("--------------------");
            System.out.println();
        }
    }
}

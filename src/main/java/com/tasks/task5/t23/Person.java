package com.tasks.task5.t23;

public class Person {

    String name;
    int age;
    int weight;

    public void reach(int speed) {
        if ((10 / speed) < 2) {
            System.out.println(name + " успеет на поезд");
        } else {
            System.out.println(name + " не успеет на поезд");
        }
    }
}

package com.tasks.task6.t5;

public class Person {

    String name;
    String town;
    String street;
    int house;
    int corps;
    int flat;

    public void address(String town, String street, int house, int corps, int flat) {
        System.out.println("Город " + town + ", улица " + street + ", дом " + house + ",");
        System.out.println("корпус " + corps + ", квартира " + flat + ".");
    }

    public void address(String town, String street, int house, int flat) {
        System.out.println("Город " + town + ", улица " + street + ",");
        System.out.println("дом " + house + ", квартира " + flat + ".");
    }

    public void address(String town, String street, int house) {
        System.out.println("Город " + town + ", улица " + street + ",");
        System.out.println("дом " + house);
    }
}

package com.tasks.task6.t30;

public class Address {

    private String name;
    private String town;
    private String street;
    private int house;
    private int corps;
    private int flat;

    public Address(String name, String town, String street, int house, int corps, int flat) {
        this.name = name;
        this.town = town;
        this.street = street;
        this.house = house;
        this.corps = corps;
        this.flat = flat;
    }

    public Address(String name, String town, String street, int house, int flat) {
        this.name = name;
        this.town = town;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public Address(String name, String town, String street, int house) {
        this.name = name;
        this.town = town;
        this.street = street;
        this.house = house;
    }

    public void display() {
        System.out.println(name);
        System.out.println("Город: " + town);
        System.out.println("улица: " + street);
        System.out.println("дом: " + house);
        System.out.println("корпус: " + corps);
        System.out.println("квартира: " + flat);
        System.out.println();
    }
}

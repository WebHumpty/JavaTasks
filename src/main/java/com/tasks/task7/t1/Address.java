package com.tasks.task7.t1;

public class Address {

    private String name;
    private String town;
    private String street;
    private int house;
    private int corpus;
    private int flat;

    public Address(String name, String town, String street, int house, int corpus, int flat) {
        this.name = name;
        this.town = town;
        this.street = street;
        this.house = house;
        this.corpus = corpus;
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
        System.out.print("Город: " + town + ", ");
        System.out.print("улица: " + street + ", ");
        System.out.print("дом: " + house + ", ");
        System.out.print("корпус: " + corpus + ", ");
        System.out.print("квартира: " + flat + ".");
        System.out.println();
    }
}

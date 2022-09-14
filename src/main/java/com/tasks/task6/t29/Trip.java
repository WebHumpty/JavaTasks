package com.tasks.task6.t29;

public class Trip {

    private int bus;
    private int hotel;
    private int breakfast;
    private int tour1;
    private int tour2;
    private int shopping;

    public Trip(int bus, int hotel, int breakfast, int tour1, int tour2, int shopping) {
        this.bus = bus;
        this.hotel = hotel;
        this.breakfast = breakfast;
        this.tour1 = tour1;
        this.tour2 = tour2;
        this.shopping = shopping;
    }

    public Trip(int bus, int hotel, int breakfast, int tour1, int shopping) {
        this.bus = bus;
        this.hotel = hotel;
        this.breakfast = breakfast;
        this.tour1 = tour1;
        this.shopping = shopping;
    }

    public Trip(int bus, int hotel, int breakfast, int shopping) {
        this.bus = bus;
        this.hotel = hotel;
        this.breakfast = breakfast;
        this.shopping = shopping;
    }

    public Trip(int bus, int hotel, int shopping) {
        this.bus = bus;
        this.hotel = hotel;
        this.shopping = shopping;
    }

    public void costOfTrip() {
        System.out.println("Стоимость тура: " + bus + " руб.");
        System.out.println("Гостиница: " + hotel + " руб.");
        System.out.println("Завтрак: " + breakfast + " руб.");
        System.out.println("Экскурссия 1: " + tour1 + " руб.");
        System.out.println("Экскурссия 2: " + tour2 + " руб.");
        System.out.println("Магазины: " + shopping + " руб.");
        System.out.println("Стоимость путишествия: " + (bus + hotel + breakfast + tour1 + tour2 + shopping) + " руб.");
        System.out.println();
    }
}

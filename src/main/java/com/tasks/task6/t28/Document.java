package com.tasks.task6.t28;

public class Document {

    private String name;
    private String surname;
    private String patronymic;
    private String series;
    private int number;

    public Document(String name, String surname, String patronymic, String series, int number) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.series = series;
        this.number = number;
    }

    public Document(String name, String surname, String series, int number) {
        this.name = name;
        this.surname = surname;
        this.series = series;
        this.number = number;
    }

    public Document(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public void display() {
        System.out.println("Паспорт");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Отечество: " + patronymic);
        System.out.println("серия: " + series);
        System.out.println("№ " + number);
        System.out.println();
    }
}

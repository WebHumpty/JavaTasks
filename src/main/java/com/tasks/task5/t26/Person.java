package com.tasks.task5.t26;

public class Person {

    String name;
    String surname;
    int age;
    boolean student;

    public void getTicket(String town, int cost) {
        String exemption = "0 процентов";
        if (student == true) {
            exemption = "50 процентов";
            cost = cost / 2;
        }

        System.out.println("--------------------------");
        System.out.println("Билет до города " + town);
        System.out.println("*" + name + ", " + surname + ", " + age + " лет.");
        System.out.println("*льгота-" + exemption + "*");
        System.out.println("**Стоимость-" + cost + " руб.**");
        System.out.println("***ПРИЯТНОГО ПУТИ***");
        System.out.println("--------------------------");
    }
}

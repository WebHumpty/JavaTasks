package com.tasks.task5.t5;

/**
 * Задача 95:
 * Программа выводит данные о животных, живущих у бабушки.
 */
public class AnimalApp {

    public static void main(String[] args) {
        Animal goat = new Animal();
        Animal cow = new Animal();
        Animal pig = new Animal();

        goat.animal = "Коза";
        goat.name = "Катя";
        goat.age = 3;

        cow.animal = "Корова";
        cow.name = "Зорька";
        cow.age= 4;

        pig.animal = "Свинья";
        pig.name = "Хорька";
        pig.age = 2;

        System.out.println("У бабушки живут:");
        System.out.println(goat.animal + " " + goat.name + " " + goat.age + " года.");
        System.out.println(cow.animal + " " + cow.name + " " + cow.age + " года.");
        System.out.println(pig.animal + " " + pig.name + " " + pig.age + " года.");
    }
}

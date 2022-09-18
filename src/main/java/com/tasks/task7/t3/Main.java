package com.tasks.task7.t3;

/**
 * Задача 162:
 * Программа использует 2 метода(increase1 и increase2) для увеличения размеров коробки.
 * В первом случае аргумент передается по значению, во втором – по ссылке.
 * В первом случае изначальный объект не меняется, во втором – меняется.
 */
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);

        System.out.println("Ширина: " + box.width);
        System.out.println("Высота: " + box.height);
        System.out.println("Длина: " + box.length);

        box.increase1(box.width, box.height, box.length);

        System.out.println("Ширина: " + box.width);
        System.out.println("Высота: " + box.height);
        System.out.println("Длина: " + box.length);

        box.increase2(box);

        System.out.println("Ширина: " + box.width);
        System.out.println("Высота: " + box.height);
        System.out.println("Длина: " + box.length);
    }
}

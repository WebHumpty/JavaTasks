package com.tasks.task5.t1;

public class BoxApp {

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Коробка");
        System.out.println("Ширина: " + box.width + " см.");
        System.out.println("Высота: " + box.height + " см.");
        System.out.println("Глубина: " + box.length + " см.");
        System.out.println("Цвет: " + box.color);
    }
}

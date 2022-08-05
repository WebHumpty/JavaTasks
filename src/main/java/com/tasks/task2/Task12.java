package com.tasks.task2;

/**
 * Задача 24: Программа выдает в случайном порядке сезон года и месяц.
 */
public class Task12 {

    public static void main(String[] args) {
        int season = (int)(Math.random() * 4);
        int month = (int)(Math.random() * 3);

        switch (season) {
            case 0:
                System.out.print("Зима - ");
                switch (month) {
                    case 0:
                        System.out.println("Декабрь");
                        break;
                    case 1:
                        System.out.println("Январь");
                        break;
                    case 2:
                        System.out.println("Февраль");
                        break;
                }
                break;
            case 1:
                System.out.print("Весна - ");
                switch (month) {
                    case 0:
                        System.out.println("Март");
                        break;
                    case 1:
                        System.out.println("Апрель");
                        break;
                    case 2:
                        System.out.println("Май");
                        break;
                }
                break;
            case 2:
                System.out.print("Лето - ");
                switch (month) {
                    case 0:
                        System.out.println("Июнь");
                        break;
                    case 1:
                        System.out.println("Июль");
                        break;
                    case 2:
                        System.out.println("Август");
                        break;
                }
                break;
            case 3:
                System.out.print("Осень - ");
                switch (month) {
                    case 0:
                        System.out.println("Сентябрь");
                        break;
                    case 1:
                        System.out.println("Октябрь");
                        break;
                    case 2:
                        System.out.println("Ноябрь");
                        break;
                }
                break;
        }
    }
}

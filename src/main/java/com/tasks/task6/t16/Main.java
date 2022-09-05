package com.tasks.task6.t16;

/**
 * Задача 145:
 * Программа имитирует работу автомата по продаже колы.
 * Автомат принимает купюры и выдает сдачу и колу,
 * или сообщает, что недостаточно средств.
 */
public class Main {

    public static void main(String[] args) {
        ColaSales colaSales = new ColaSales();

        Bill bill1 = new Bill();
        bill1.cost = 20;
        colaSales.selling(bill1);

        Bill bill2 = new Bill();
        bill2.cost = 30;
        colaSales.selling(bill2);

        Bill bill3 = new Bill();
        bill3.cost = 50;
        colaSales.selling(bill3);

        Bill bill4 = new Bill();
        bill4.cost = 40;
        colaSales.selling(bill4);
    }
}

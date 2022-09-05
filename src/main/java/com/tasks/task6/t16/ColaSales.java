package com.tasks.task6.t16;

public class ColaSales {

    static String name = "Автомат продажи колы ";
    static int costOfCola = 40;
    int count = 0;

    public void selling(Bill bill) {
        System.out.println("Внесено " + bill.cost + " руб.");
        count = count + bill.cost;
        if (count >= costOfCola) {
            System.out.println(name + " выдает бутылку колы");
            System.out.println(name + " сдача " + (count - costOfCola) + " руб.");
            count = 0;
            System.out.println();
        } else {
            System.out.println("Недостаточно средств, для покупки.");
        }
    }
}

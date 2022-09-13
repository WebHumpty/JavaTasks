package com.tasks.task6.t28;

/**
 * Задача 157:
 * Программа выводит паспортные данные трех разных людей,
 * количество реквизитов в каждом случае разное.
 */
public class Main {

    public static void main(String[] args) {
        Document document1 = new Document("Иван", "Иванов", "Иванович", "GX", 256890);
        Document document2 = new Document("Илья", "Коринов", "HF", 256794);
        Document document3 = new Document("Максим", "Фараонов", 256909);

        document1.display();
        document2.display();
        document3.display();
    }
}

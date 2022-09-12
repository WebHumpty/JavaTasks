package com.tasks.task6.t27;

/**
 * Задача 156:
 * Программа выводит паспортные данные трех разных людей,
 * количество реквизитов в каждом случае разное.
 */
public class Main {

    public static void main(String[] args) {
        Document document1 = new Document("Иван", "Иванов", "Андреевич", "HC", 256800);
        Document document2 = new Document("Петр", "Уколов", "HG", 567890);
        Document document3 = new Document("Маским", "Коринов", 234567);

        document1.display();
        document2.display();
        document3.display();
    }
}

package com.dmitry.present_box;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Box {
    public static void main(String[] args) throws IOException { //для обработки ошибок ввода
        collectGift();
    }

    public static void collectGift() throws IOException {
        ArrayList<Sweets> sweets = new ArrayList<>(); //автоматически расширяемый массив сладостей
        boolean formed = false;
        int totalPrice = 0;
        int totalWeight = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите какую сладость нужно добавить в подарок:");
        System.out.println("'1' - конфеты \"Детям\"");
        System.out.println("'2' - конфеты \"Мишка\"");
        System.out.println("'3' - мармелад \"Сластена\"");
        System.out.println("'4' - мармелад \"Слипнисьзад\"");
        System.out.println("'5' - закончить выбор");
        while (!formed) {

            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    //объявить , выделить память и инициализировать объекты типа Candy
                    Candy candy1 = new Candy("Конфеты \"Детям\"", 145, 70, "Без шоколада");
                    sweets.add(candy1);
                    totalPrice += candy1.getPrice();
                    totalWeight += candy1.getWeight();
                    System.out.println("Конфеты \"Детям\" добавлены в подарок");
                    break;
                case "2":
                    Candy candy2 = new Candy("Конфеты \"Мишка\"", 199, 85, "Очень сладкие");
                    sweets.add(candy2);
                    totalPrice += candy2.getPrice();
                    totalWeight += candy2.getWeight();
                    System.out.println("Конфеты \"Мишка\" добавлены в подарок");
                    break;
                //объявить , выделить память и инициализировать объекты типа Jellybean
                case "3":
                    Jellybean marmelad1 = new Jellybean("Мармелад \"Сластена\"", 99, 10, "Разноцветные");
                    sweets.add(marmelad1);
                    totalPrice += marmelad1.getPrice();
                    totalWeight += marmelad1.getWeight();
                    System.out.println("Мармелад \"Сластена\" добавлен в подарок");
                    break;
                case "4":
                    Jellybean marmelad2 = new Jellybean("Мармелад \"Слипнисьзад\"", 95, 20, "Один сахар");
                    sweets.add(marmelad2);
                    totalPrice += marmelad2.getPrice();
                    totalWeight += marmelad2.getWeight();
                    System.out.println("Мармелад \"Слипнисьзад\" добавлен в подарок");
                    break;
                case "5":
                    formed = true;
                    break;
            }


        }
        int count = 0;
        System.out.println("\nСостав подарка:");
        for (Sweets sweet:sweets) {
            count++;
            System.out.println(count + ". " + sweet.getName() + " - " + sweet.getUniqueParam());
        }
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice));
    }

}

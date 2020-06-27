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
                    sweets.add(new Candy ("Конфеты \"Детям\"", 145, 70, "45 x 35"));
                    break;
                case "2":
                    sweets.add(new Candy("Конфеты \"Мишка\"", 199, 85, "40 x 30"));
                    break;
                //объявить , выделить память и инициализировать объекты типа Jellybean
                case "3":
                    sweets.add(new Jellybean("Мармелад \"Сластена\"", 99, 10, "Red"));
                    break;
                case "4":
                    sweets.add(new Jellybean("Мармелад \"Слипнисьзад\"", 95, 20, "Brown"));
                    break;
                case "5":
                    formed = true;
                    break;
            }
            Sweets lastSweet = sweets.get(sweets.size() - 1);
            System.out.println("Конфеты "+ lastSweet.getName() + " добавлены в подарок");
        }
        int count = 0;
        System.out.println("\nСостав подарка:");
        for (Sweets sweet:sweets) {
            count++;
            totalPrice += sweet.getPrice();
            totalWeight += sweet.getWeight();
            System.out.println(count + ". " + sweet);

        }
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice));
    }

}

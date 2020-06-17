package com.dmitry.present_box;
//релизуем интерфейс в классе Jellybean
public class Jellybean implements Sweets{
    String name;
    int price;
    int weight;
    String UniqueParam;
    //конструктор для указанных выше полей
    public Jellybean(String name, int price, int weight, String UniqueParam){
        this.name = name;
        this.price = price;
        this.weight =  weight;
        this.UniqueParam = UniqueParam;
    }
//генерируем гетеры и сетеры для наших полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getUniqueParam() {
        return UniqueParam;
    }

    public void setUniqueParam(String UniqueParam) {
        this.UniqueParam = UniqueParam;
    }

}

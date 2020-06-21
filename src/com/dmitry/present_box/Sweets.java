package com.dmitry.present_box;
//интерфейс Sweets как набор абстрактных методов, определяющих имя, вес и уникальный параметр
abstract class Sweets {
    private String name;
    private int price;
    private int weight;

    public Sweets(String name, int price, int weight){
        this.name = name;
        this.price = price;
        this.weight =  weight;
        //this.UniqueParam = UniqueParam;
    }

     String getName()  {
        return name;
    }

    void setName(String name)  {
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

    abstract String getUniqueParam();

    abstract void setUniqueParam(String UniqueParam);
}

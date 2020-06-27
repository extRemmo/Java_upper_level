package com.dmitry.present_box;

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
    public String toString()
    {
        return name + ", цена: " + price + ", вес: " + weight + " ";
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

}

package com.dmitry.present_box;
//релизуем интерфейс в классе Jellybean
public class Jellybean extends Sweets{

    private String colour;

    public Jellybean(String name, int price, int weight, String colour){
        super (name, price, weight);
        this.colour = colour;
    }

    public String getUniqueParam() {
        return colour;
    }

    public void setUniqueParam(String colour) {
        this.colour = colour;
    }

}

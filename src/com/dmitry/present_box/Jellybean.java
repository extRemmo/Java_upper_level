package com.dmitry.present_box;

public class Jellybean extends Sweets{

    private String colour;

    public Jellybean(String name, int price, int weight, String colour){
        super (name, price, weight);
        this.colour = colour;
    }

    public String toString()
    {
        return super.toString() + ", \033[4mцвет\033[0m: " + colour;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

}

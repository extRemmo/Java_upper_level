package com.dmitry.present_box;

public class Candy extends Sweets {

    private String size;

    public Candy(String name, int price, int weight, String size){
        super (name, price, weight);
        this.size = size;
    }

    public String toString()
    {
        return super.toString() + ", \033[4mразмер\033[0m: " + size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String UniqueParam) {
        this.size = size;
    }


}

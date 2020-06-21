package com.dmitry.present_box;
//релизуем интерфейс в классе Candy
public class Candy extends Sweets {

    private String size;

    public Candy(String name, int price, int weight, String size){
        super (name, price, weight);
        this.size = size;
    }


    public String getUniqueParam() {
        return size;
    }

    public void setUniqueParam(String UniqueParam) {
        this.size = size;
    }


}

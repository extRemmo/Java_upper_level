package com.dmitry.present_box;
//интерфейс Sweets как набор абстрактных методов, определяющих имя, вес и уникальный параметр
public interface Sweets {
    String getName();

    void setName(String name);

    int getPrice();

    void setPrice(int price);

    int getWeight();

    void setWeight(int weight);

    String getUniqueParam();

    void setUniqueParam(String UniqueParam);
}

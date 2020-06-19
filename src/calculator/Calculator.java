package calculator;

public class Calculator {
    private double a;
    private double b;

    public  Calculator (double a, double b){
        this.a = a;
        this.b = b;
    }

    /*
    описывем основные методы для работы с числами
     */
    public double add (){
        return a + b;
    }
    public double subs (){
        return a - b;
    }
    public double multi (){
        return a * b;
    }
    public double div (){
        return a / b;
    }

}

package calculator;

public class Calculator {
    private double a;
    private double b;

    public  Calculator (double a, double b){ //конструктор с параметрами (наши 2 числа)
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
    public double div () throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        } else {
            return a / b;
        }
    }

}

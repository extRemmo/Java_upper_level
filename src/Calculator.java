import java.io.IOException;
import java.util.Scanner;
/**
 * Выполнение простейших арифметических операций над числами
 * @author Dmitriy Grachev
 * @version 1.0
 * @see #calc(double, double, char)
  */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) throws IOException {
        System.out.println("Введите первое число ");
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();

        System.out.println("Введите операцию +|-|*|/|");
        char operation = (char) System.in.read();

        System.out.println("Введите второе число ");
        Scanner inn = new Scanner(System.in);
        double num2 = inn.nextDouble();

        System.out.printf("Результат операции: %.4f ", calc(num1, num2, operation)); //округляем вывод до 4 знаков
    }

    /**
     * Метод, выполяющий саму операцию
     * @param num1 - первое введенное число
     * @param num2 - второе введенное число
     * @param operation - операция сложения, вычитания, умножения, деления
     * @return результат вычисления операции над числами
     */
    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, operation);
        }
        return result;
    }
}

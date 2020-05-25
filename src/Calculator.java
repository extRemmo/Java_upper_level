import java.io.IOException;
import java.util.Scanner;
/**
 * @author dmitriy
 * @see
  */
public class Calculator {
    public static void main (String[] args) throws IOException {
        System.out.println("Введите первое число ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.println("Введите операцию +|-|*|/|");
        char operation = (char) System.in.read();

        System.out.println("Введите второе число ");
        Scanner inn = new Scanner(System.in);
        double b = inn.nextDouble();

        System.out.printf("Результат операции: %.4f ", calc(a, b, operation)); //округляем вывод до 4 знаков
    }

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

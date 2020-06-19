package calculator;

import java.util.Scanner;

public class Reader {
    /**метод, который будет считывать числа формата double
    * @return  возвратит введенное число
    */
    public double readNext () {
        Scanner scanner = new Scanner(System.in);
        double i = 0;
        if (scanner.hasNextDouble()) {
            i = scanner.nextDouble();
        }
        else {
            System.out.println("Вы ввели невещественное число!");
        }
        return i;
    }
}

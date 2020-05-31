import java.io.IOException;
import java.util.Scanner;

/**
 * Выполнение переключения между программами Калькулятор / Массив слов
 * @author Dmitriy Grachev
 * @version 2.0
 */

public class Switcher {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число 1 (запуск калькулятора) или 2 (запуск поиска строки в массиве ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) { // на определенное число создается соотв-ий экземпляр класса и его метод main
            case 1:
                Calculator yourClass1 = new Calculator();
                yourClass1.main(args);
                        break;
            case 2:
                StringArray yourClass2 = new StringArray();
                yourClass2.main(args);
                        break;
            default:
                System.out.println("Введите число 1 или 2!");
        }
    }
}

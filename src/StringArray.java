import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        System.out.println("Введите размер массива! ");
        Scanner in = new Scanner(System.in);
        int dim = in.nextInt();
        String mass1[] = new String[dim];

        for (int i = 0; i < dim; i++) {
            mass1[i] = in.next();
        }
        int maxLengthString = 0;
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i].length() > maxLengthString) {
                maxLengthString = mass1[i].length();
            }
        }
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i].length() == maxLengthString) {
                System.out.println("Самое длинное слово в массиве:" + mass1[i]);
            }
        }
    }
}


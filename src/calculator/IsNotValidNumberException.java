package calculator;

public class IsNotValidNumberException extends Exception {
    public IsNotValidNumberException() {
        super("Вы ввели неверное значение!");
    }

}

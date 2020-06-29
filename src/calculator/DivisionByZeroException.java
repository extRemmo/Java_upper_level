package calculator;

public class DivisionByZeroException extends Exception {
    public String toString() {
        return "DivisionByZeroException (делить на ноль нельзя!)";
    }

}

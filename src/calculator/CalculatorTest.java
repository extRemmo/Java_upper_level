package calculator;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    private Calculator calculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @org.junit.Test
    public void testAdditionOfTwoNumbers() {
        calculator = new Calculator(10.5,5.5);
        Assert.assertEquals(16.0, calculator.add(),0.0);

    }

    @org.junit.Test
    public void testSubstitutionOfTwoNumbers() {
        calculator = new Calculator(10.2,15.1);
        Assert.assertEquals(-4.9, calculator.subs(), 0.0);
    }

    @org.junit.Test
    public void testMultiplicationOfTwoNumbers() {
        calculator = new Calculator(7,-7);
        Assert.assertEquals(-49, calculator.multi(), 0.0);
    }

    @org.junit.Test
    public void testDivisionOfTwoNumbers() throws DivisionByZeroException {
        calculator = new Calculator(1, 10);
        Assert.assertEquals(0.1, calculator.div(), 0.0);
    }

    @Test(expected = DivisionByZeroException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() throws DivisionByZeroException {
        calculator = new Calculator(0, 0);
        calculator.div();
    }
    /*
    тот же тест но на проверку самого текста ошибки
     */
    @Test
    public void testDivideWillThrowExceptionWhenDivideOnZero2() throws DivisionByZeroException {
        expectedException.expect(DivisionByZeroException.class);
        expectedException.expectMessage("Делить на ноль нельзя!");
        calculator = new Calculator(0, 0);
        calculator.div();
    }

}
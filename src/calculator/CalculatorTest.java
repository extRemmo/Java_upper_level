package calculator;

public class CalculatorTest {

    public static void main(String[] args)  {
        try {
            CalculatorTest.action(args);
        } catch (DivisionByZeroException|IsNotValidNumberException e){
            System.out.println("Exception handled: " + e);
        }

    }

    public static void action(String[] args) throws DivisionByZeroException, IsNotValidNumberException {
        Reader reader = new Reader(); // создали ссылку на экземпляр класса Reader (считывание числа)
        double num1;
        double num2;
        int action;

        do {
            System.out.print("Введите первое число: ");
            num1 = reader.readNext(); //считываем число и запишем в переменные
            System.out.print("Введите второе число: ");
            num2 = reader.readNext();
            Calculator calc = new Calculator(num1, num2);

            // создаем ссылку на объект класса Calculator и иниц. ее с помощью конструктора

            System.out.println("Выберите операцию:");
            System.out.println("1 - Сложить");
            System.out.println("2 - Вычесть");
            System.out.println("3 - Умножить");
            System.out.println("4 - Разделить");
            System.out.println("0 - Выход");

            action = (int) reader.readNext(); //считаем double число используя метод readNext, но приводим к целочисл.типу

            switch (action) {
                case 1:
                    System.out.printf("Результат операции: %.4f\n ", calc.add());
                    break;

                case 2:
                    System.out.printf("Результат операции: %.4f\n ", calc.subs());
                    break;

                case 3:
                    System.out.printf("Результат операции: %.4f\n ", calc.multi());
                    break;

                case 4:
                    if (num2 == 0) {
                        throw new DivisionByZeroException();

                    } else {
                        System.out.printf("Результат операции: %.4f\n ", calc.div());
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Выберите один из указанных пунктов!");

            }
        } while (action != 0);

    }
}


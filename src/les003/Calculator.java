package les003;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Double numberOne = null;
            Double numberTwo = null;

            String operationType;
            Scanner sc = new Scanner(System.in);
            while (true) {
                if (numberOne == null) {
                    System.out.println("input number one: ");
                    numberOne = sc.nextDouble();
                    sc.nextLine(); // очистка перевода строки
                }
                System.out.println("input number operatin: '+', '-', '/', '*' or q in exit");
                operationType = sc.nextLine();
                if (operationType.equals("q")) break;

                System.out.println("input number two: ");
                numberTwo = sc.nextDouble();
                sc.nextLine(); // очистка перевода строки

                numberOne = switch (operationType) {
                    case "+" -> numberOne + numberTwo;
                    case "-" -> numberOne - numberTwo;
                    case "*" -> numberOne * numberTwo;
                    case "/" -> {
                        if (numberTwo == 0) {
                            System.out.println("Error operation: not correct divided by zero");
                            System.out.println("result: " + numberOne);
                            yield Double.NaN;
                        }
                        yield numberOne / numberTwo;
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + operationType);
                };
                if (Double.isNaN(numberOne)) break;

                System.out.println("result: " + numberOne);

            }
        } catch (Exception e) {
            System.out.println("is error: \n" + e);
        }
    }
}

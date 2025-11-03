package les002;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Les2 {
    public static void main(String[] args) {

//        System.out.printf("is double a = %.2f", a);

        Scanner scanner = new Scanner(System.in);

        System.out.println("input numbers a and b: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        // num2
        Boolean c = Math.pow(a,3) > Math.pow(b,2);
        //num1
        double resCalculate = b * a * (a + b) / Math.pow(a,2);

        System.out.printf("is a^3 > b^2: %b\n", c);
        System.out.printf("result of b * a * (a + b) / a^2: %.2f\n", resCalculate);

        //num3
        int x = 1;
        int y = x++;
        y += x++;
        System.out.println(y);
    }
}
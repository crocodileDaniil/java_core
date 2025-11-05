package les004;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number");
        int n = sc.nextInt();

        long resultFactorial = 1;
        for (int i = 1; i <= n; i++) {
            resultFactorial *= i;
        }
        System.out.println("result calc factorial: " + resultFactorial);

        int sumNumbers = 0;

        do {
            sumNumbers += n % 10;
            n /= 10;
        } while (n > 0);
        System.out.println("sum numbers: " + sumNumbers);
    }
}

package les003;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        int a = sc.nextInt();
        System.out.println("Input second number: ");
        int b = sc.nextInt();

        if (a % 2 == 0 || b % 3 == 0) {
            if (a == b) {
                System.out.println("number 1 = number 2");
            } else if (a > b) {
                System.out.println("number 1 > number 2");
            } else {
                System.out.println("number 1 < number 2");
            }

        } if (a % 2 == 0 && a % 3 == 0) {
            long res = (long) Math.pow(a, b);

            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
                System.out.println("a ^ b goes beyond the boundaries");
            } else {
                System.out.println("res: \n" + res);
            }
        }

    }
}

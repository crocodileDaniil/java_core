package les003;

import java.util.Scanner;

public class Les3 {

    public static void main(String[] args) {
        System.out.println("Start program lesson 3");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 2 integer numbers");

        try {
            System.out.println("numbers \"a\": ");
            int a = sc.nextInt();
            System.out.println("numbers \"b\": ");
            int b = sc.nextInt();

            if (a % 2 == 0) {
                System.out.println("Multuple: " + (a * b));
                return;
            }
            System.out.println("Divideng: " + ((double)a / b));

        } catch(Exception e) {
            System.out.println("Error: \n" + e);
        }


    }
}

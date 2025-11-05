package les004;

import java.util.Scanner;

public class PainterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a: ");
        int a = sc.nextInt();

        System.out.println("Input b: ");
        int b = sc.nextInt();

        for(int i = 1; i <= b; i++) {
            if(i == 1 || i == b) {
                System.out.print(" ");
            } else {
                System.out.print("|");
            }

            for(int j = 1; j <= a; j++) {
                if(i == 1 || i == b) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }

            if(i == 1 || i == b) {
                System.out.print(" ");
            }else {
                System.out.print("|");
            }

            System.out.println();
        }
    }
}

package les003;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input word(words): 'Hi' or 'Bye' or 'How are you'");

        String str = sc.nextLine();
        switch (str) {
            case "Hi" -> System.out.println("Hello");
            case "Bye" -> System.out.println("Good bye");
            case "How are you" -> System.out.println("How are your doing");
            default -> System.out.println("Unknown message");
        }

        if (str.equals("Hi")) {
            System.out.println("Hello");
        } else if (str.equals("Bye")) {
            System.out.println("Good bye");
        } else if (str.equals("How are you")) {
            System.out.println("How are your doing");
        } else {
            System.out.println("Unknown message");
        }

        System.out.println("Input lastname: ");
        String lastname = sc.nextLine();
        System.out.println("Input name: ");
        String name = sc.nextLine();
        System.out.println("Input patronymic: ");
        String patronymic = sc.nextLine();
        System.out.println("full name: " + lastname + " " + name + " " + patronymic);
        System.out.printf("full name: %s %s %s \n", lastname, name, patronymic);
    }
}

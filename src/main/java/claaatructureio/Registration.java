package claaatructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your E-mail address?");
        String email = scanner.nextLine();

        System.out.println("Your name: " + name);
        System.out.println("Your E-mail address: " + email);

    }
}

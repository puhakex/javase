package claaatructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("What is your E-mail address?");
        Scanner emailaddress = new Scanner(System.in);
        String email = emailaddress.nextLine();

        System.out.println("Your name: " + name);
        System.out.println("Your E-mail address: " + email);

    }
}

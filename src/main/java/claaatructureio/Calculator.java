package claaatructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please give me the first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please give me the second number:");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " + " + secondNumber);
        System.out.println(firstNumber + secondNumber);


    }
}

package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //taking in two numbers from user input
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        System.out.printf("The first number is %d and the second number is %d", firstNum, secondNum );

    }
}

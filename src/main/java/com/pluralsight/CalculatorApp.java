package com.pluralsight;

import java.util.Objects;
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

        //System.out.printf("The first number is %d and the second number is %d", firstNum, secondNum );

        System.out.println("Possible calculations");
        System.out.println("\n(A)dd");
        System.out.println("\n(S)ubtract");
        System.out.println("\n(M)ultiply");
        System.out.println("\n(D)ivide");
        System.out.print("Please select an option: ");
        String operation = scanner.nextLine();

        System.out.println();


        System.out.printf("%d * %d = %d", firstNum, secondNum, firstNum * secondNum);



    }
}

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        calculator(userInput);

    }


    public static void calculator(Scanner sc) {
        System.out.print("Enter the calculation formula: ");
        String userStringInput = sc.nextLine().replaceAll("\\s", "");

        // Validate input
        if (!userStringInput.matches("\\d+[-+*/]\\d+")) {
            System.out.println("Invalid input! Enter in format: {number}{operator}{number}");
            return;
        }

        // Split numbers and operand
        String[] arrayInput = userStringInput.split("([-+*/])");
        String operand = userStringInput.replaceAll("[0-9]", "");

        int num1 = Integer.parseInt(arrayInput[0]);
        int num2 = Integer.parseInt(arrayInput[1]);
        int sum = 0;

        switch (operand) {
            case "-":
                sum += num1 - num2;
                break;

            case "+":
                sum += num1 + num2;
                break;
            case "*":
                sum += num1 * num2;
                break;
            case "/":
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Cant divide with 0 !");
                    return;
                }
                sum += num1 / num2;
                break;
            default:
                System.out.println("Wrong input");
        }
        System.out.println(num1 + " " + operand + " " + num2 + " = " + sum);
    }
}



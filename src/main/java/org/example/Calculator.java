package org.example;

import java.util.Scanner;

public class Calculator {

    private int[] arrayStringToInt(String[] stringInputArray) {
        int[] numArray = new int[stringInputArray.length];

        for (int i = 0; i < stringInputArray.length; i++) {
            numArray[i] = Integer.parseInt(stringInputArray[i]);
        }

        return numArray;
    }

    public void calculation(Scanner sc) {
        System.out.print("Enter the calculation formula (Example  3+5-2*4): ");
        String userStringInput = sc.nextLine().replaceAll("\\s", "");

        // Validate input
        if (!userStringInput.matches("\\d+([-+*/]\\d+)*")) {
            System.out.println("Invalid input! Enter in format: {number}{operator}{number}");
            return;
        }

        // Get number and operator
        String[] numberStrings = userStringInput.split("[-+*/]");
        String operators = userStringInput.replaceAll("[0-9]", "");

        int[] numbers = arrayStringToInt(numberStrings);
        double result = numbers[0];

        for (int i = 0; i < operators.length(); i++) {
            char operator = operators.charAt(i);
            int num = numbers[i + 1];

            switch (operator) {
                case '+':
                    result = addition(result, num);
                    break;
                case '-':
                    result = subtraction(result, num);
                    break;
                case '*':
                    result = multiplier(result, num);
                    break;
                case '/':
                    result = divider(result, num);
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
                    return;
            }
        }
        System.out.println(result == (int) result ? "Result: " + (int) result : "Result: " + result);
    }

    private double addition(double num1, double num2) {
        return num1 + num2;
    }

    private double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplier(double num1, double num2) {
        return num1 * num2;
    }

    private double divider(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can not divide by 0");
            return 0;
        }
        return num1 / num2;
    }
}

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String menuChoice;

        while (true) {
            System.out.println("Press 1 to calculate");
            System.out.println("Press 2 to go back to old Sum");
            System.out.println("Press 3 to quit");

            menuChoice = userInput.nextLine();


            if (menuChoice.contains("1")) {
                calculator(userInput);
            } else if (menuChoice.contains("2")) {
                System.out.println("This is second menu ");
            } else if (menuChoice.contains("3")) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("WRONG MENU CHOICE !!");
            }
        }

        userInput.close();
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplier(double num1, double num2) {
        return num1 * num2;
    }

    public static double divider(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can not divide by 0");
            return 0;
        }
        return num1 / num2;
    }

    public static int[] arrayStringToInt(String[] stringInputArray) {
        int[] numArray = new int[stringInputArray.length];

        for (int i = 0; i < stringInputArray.length; i++) {
            numArray[i] = Integer.parseInt(stringInputArray[i]);
        }

        return numArray;
    }

    public static void calculator(Scanner sc) {
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
}

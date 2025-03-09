package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String menuChoice;

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.println("Press 1 to calculate");
            System.out.println("Press 2 to go back to old Sum");
            System.out.println("Press 3 to quit");

            menuChoice = userInput.nextLine();


            if (menuChoice.contains("1")) {
                calculator.calculation (userInput);
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
}

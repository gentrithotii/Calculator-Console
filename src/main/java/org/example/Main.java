package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        CalculatorMenu calcMenu = new CalculatorMenu(calc);
        calcMenu.printMainMenu();
    }
}

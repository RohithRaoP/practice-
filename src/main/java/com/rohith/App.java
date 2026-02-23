package com.rohith;

public class App {

    public static void main(String[] args) {

        System.out.println("=== Welcome to CI/CD Demo ===");

        int number1 = 10;
        int number2 = 20;

        int result = add(number1, number2);

        System.out.println("Addition Result: " + result);

        System.out.println("Build and Execution Successful!");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

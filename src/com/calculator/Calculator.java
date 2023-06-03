package com.calculator;
import java.util.Scanner;
public class Calculator {
	



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Select an operation: ");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Division");
	        System.out.print("Enter your choice (1-3): ");
	        int choice = scanner.nextInt();

	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case 3:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Cannot divide by zero!");
	                }
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }
	    }
	}



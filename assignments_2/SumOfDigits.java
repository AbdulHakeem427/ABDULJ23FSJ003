package assignments_2;

import java.util.Scanner;

public class SumOfDigits {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.print("Enter a positive integer: ");
//	        int number = scanner.nextInt();
//	        scanner.close();
//
//	        int sum = calculateSumOfDigits(number);
//	        System.out.println("The sum of the digits of the entered number is: " + sum);
//	    }

	    public static int calculateSumOfDigits(int number) {
	        // Base case: if the number is a single digit, return the number itself
	        if (number < 10) {
	            return number;
	        }

	        // Calculate the last digit and recur for the remaining digits
	        return (number % 10) + calculateSumOfDigits(number / 10);
	    }
	


}

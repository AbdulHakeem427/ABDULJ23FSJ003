package LabBookCoreJava;

public class Lab15b {
	    public static void main(String[] args) {
	        int number = 153; // Replace this with the number you want to check
	        if (isArmstrongNumber(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else if (isPerfectNumber(number)) {
	            System.out.println(number + " is a Perfect number.");
	        } else if (isPalindrome(number)) {
	            System.out.println(number + " is a Palindrome.");
	        } else {
	            System.out.println(number + " is none of these.");
	        }
	    }

	    public static boolean isArmstrongNumber(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int digits = String.valueOf(number).length();

	        while (number != 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, digits);
	            number /= 10;
	        }

	        return sum == originalNumber;
	    }

	    public static boolean isPerfectNumber(int number) {
	        int sum = 0;

	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        return sum == number;
	    }

	    public static boolean isPalindrome(int number) {
	        int originalNumber = number;
	        int reversedNumber = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }
	

}

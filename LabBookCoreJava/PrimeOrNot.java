package LabBookCoreJava;

import java.util.stream.IntStream;

public class PrimeOrNot {
	public static void main(String[] args) {
		
	        int number = 29; // Change the number to check for primality

	        boolean isPrime = isNumberPrime(number);

	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	    private static boolean isNumberPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
	                .noneMatch(i -> number % i == 0);
	    }
	

}

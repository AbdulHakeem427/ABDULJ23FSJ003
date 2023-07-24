package LabBookCoreJava;

import java.util.Scanner;

public class ConvertingNumIntoWord {
	    private static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	    private static final String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	    private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        String words = convertToWords(number);
	        System.out.println(number + " in words: " + words);
	    }

	    public static String convertToWords(int number) {
	        if (number == 0) {
	            return "zero";
	        }

	        if (number < 0) {
	            return "minus " + convertToWords(-number);
	        }

	        String result = "";

	        // Handling millions, billions, trillions, etc.
	        if (number >= 1000000000) {
	            result += convertToWords(number / 1000000000) + " billion ";
	            number %= 1000000000;
	        }
	        if (number >= 1000000) {
	            result += convertToWords(number / 1000000) + " million ";
	            number %= 1000000;
	        }
	        if (number >= 1000) {
	            result += convertToWords(number / 1000) + " thousand ";
	            number %= 1000;
	        }

	        // Handling hundreds and remaining two-digit numbers
	        if (number >= 100) {
	            result += units[number / 100] + " hundred ";
	            number %= 100;
	        }

	        if (number >= 10 && number < 20) {
	            result += teens[number - 10] + " ";
	            number = 0;
	        } else if (number >= 20) {
	            result += tens[number / 10] + " ";
	            number %= 10;
	        }

	        if (number > 0) {
	            result += units[number] + " ";
	        }

	        return result.trim();
	    }
	

}

package LabBookCoreJava;

import java.util.Scanner;

public class SearchingElement{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Sample array (you can change it as per your requirements)
	        int[] arr = { 2, 7, 3, 8, 5, 7, 9, 3, 7, 1 };

	        System.out.print("Enter the element to search for: ");
	        int target = scanner.nextInt();

	        int occurrences = 0;
	        boolean found = false;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                if (!found) {
	                    System.out.println(target + " is found at location(s):");
	                }
	                System.out.println("Index " + i);
	                occurrences++;
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println(target + " is not found in the array.");
	        } else {
	            System.out.println(target + " occurs " + occurrences + " time(s) in the array.");
	        }
	    }
	

}

package LabBookCoreJava;

import java.util.Scanner;

public class LocationOfArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Input the element to be searched
	        System.out.print("Enter the element to find its location: ");
	        int elementToFind = scanner.nextInt();

	        // Find the location of the element
	        int location = findElementLocation(arr, elementToFind);

	        // Display the result
	        if (location != -1) {
	            System.out.println("Element found at index: " + location);
	        } else {
	            System.out.println("Element not found in the array.");
	        }

	        scanner.close();
	    }

	    // Function to find the location of an element in the array
	    public static int findElementLocation(int[] arr, int elementToFind) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == elementToFind) {
	                return i;
	            }
	        }
	        return -1; // Element not found
	    }
	

}

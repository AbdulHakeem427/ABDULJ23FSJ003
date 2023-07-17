package LabBookCoreJava;

import java.util.Scanner;

public class Lab9 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the array elements from the user
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Reverse the array elements
	        reverseArray(arr);

	        // Display the reversed array
	        System.out.println("Reversed array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        scanner.close();
	    }

	    // Function to reverse the elements in the array
	    public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start < end) {
	            // Swap the elements at start and end positions
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	            // Move the pointers towards the center
	            start++;
	            end--;
	        }
	    }
	

}

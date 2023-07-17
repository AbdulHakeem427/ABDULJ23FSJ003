package LabBookCoreJava;

public class Lab20 {
	    public static void main(String[] args) {
	        int[][] arr = {
	            {1, 5, 9},
	            {3, 8, 2},
	            {7, 4,10}
	        };

	        findLargestInRows(arr);
	    }

	    public static void findLargestInRows(int[][] arr) {
	        for (int row = 0; row < arr.length; row++) {
	            int largest = Integer.MIN_VALUE;

	            for (int num : arr[row]) {
	                if (num > largest) {
	                    largest = num;
	                }
	            }

	            System.out.println("Largest element in Row " + (row + 1) + ": " + largest);
	        }
	    }
	

}

package LabBookCoreJava;

public class Lab19 {
	    public static void main(String[] args) {
	        int[][] arr = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        System.out.println("Original Array:");
	        printArray(arr);

	        reverseRows(arr);

	        System.out.println("\nArray with Rows Reversed:");
	        printArray(arr);
	    }

	    public static void reverseRows(int[][] arr) {
	        for (int row = 0; row < arr.length; row++) {
	            int left = 0;
	            int right = arr[row].length - 1;

	            while (left < right) {
	                int temp = arr[row][left];
	                arr[row][left] = arr[row][right];
	                arr[row][right] = temp;

	                left++;
	                right--;
	            }
	        }
	    }

	    public static void printArray(int[][] arr) {
	        for (int[] row : arr) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
	


}

package LabBookCoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class ResizingOfArray {
	public static void main(String[] args) {
		        // Original array
		        int[] originalArray = {1, 2, 3, 4, 5};
		        System.out.println("Original Array: " + Arrays.toString(originalArray));
		
		        // Resize the array to a new size
		        int newLength = 8;
		        int[] resizedArray = resizeArray(originalArray, newLength);
		        System.out.println("Resized Array: " + Arrays.toString(resizedArray));
		    }

		    public static int[] resizeArray(int[] array, int newSize) {
		        int[] resizedArray = new int[newSize];
		        int elementsToCopy = Math.min(array.length, newSize);
		        System.arraycopy(array, 0, resizedArray, 0, elementsToCopy);
		        return resizedArray;
		    

	}
}

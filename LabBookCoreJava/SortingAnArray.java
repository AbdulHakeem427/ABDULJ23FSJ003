package LabBookCoreJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingAnArray {
	public static void main(String[] args) {
		reverseArray();
	}
	static public void reverseArray() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an array size :");
		int n=scan.nextInt();
		
		System.out.println("Enter an array elements :");
		Integer[] number=new Integer[n];
		
		 for (int i = 0; i < n; i++) {
	            number[i] = scan.nextInt();
	        }
		
		Arrays.sort(number);
        System.out.println("Ascending Order: " + Arrays.toString(number));
        
    	Arrays.sort(number,Collections.reverseOrder());
        System.out.println("decending Order: " + Arrays.toString(number));

	}
}

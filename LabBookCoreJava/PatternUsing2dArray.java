package LabBookCoreJava;

public class PatternUsing2dArray {
	    public static void main(String[] args) {
	        int[][] matrix = new int[4][4];
	        int count = 1;

	        // Fill the matrix with numbers
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                matrix[i][j] = count++;
	                System.out.print(matrix[i][j] + " ");// Display the matrix
	            }
	            System.out.println();
	        }
	    }
	

}

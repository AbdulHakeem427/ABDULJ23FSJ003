package LabBookCoreJava;

public class Pattern2 {
	    public static void main(String[] args) {
	        int[][] matrix = new int[4][4];
	        int count = 1;

	        // Fill the matrix with numbers in the specified pattern
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j <= i; j++) {
	                matrix[i][j] = count++;
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	            
	        }

	    }
	


}

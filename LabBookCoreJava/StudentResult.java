package LabBookCoreJava;

import java.util.Scanner;

public class StudentResult {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of students and subjects
	        System.out.print("Enter the number of students: ");
	        int numStudents = scanner.nextInt();

	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        // Create a 2D array to store student marks
	        int[][] studentMarks = new int[numStudents][numSubjects];

	        // Input student marks
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter marks for student " + (i + 1) + ":");
	            for (int j = 0; j < numSubjects; j++) {
	                System.out.print("Subject " + (j + 1) + ": ");
	                studentMarks[i][j] = scanner.nextInt();
	            }
	            System.out.println(); // Blank line for readability
	        }

	        // Calculate and display the result for each student
	        System.out.println("Student Results:");
	        for (int i = 0; i < numStudents; i++) {
	            int totalMarks = 0;
	            for (int j = 0; j < numSubjects; j++) {
	                totalMarks += studentMarks[i][j];
	            }
	            double averageMarks = (double) totalMarks / numSubjects;

	            System.out.println("Student " + (i + 1) + ": Total Marks = " + totalMarks + ", Average Marks = " + averageMarks);
	        }

	        
	    }
	

}

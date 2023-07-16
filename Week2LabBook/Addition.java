package Week2LabBook;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		System.out.println("Enter two numbers :");
		Scanner scan=new Scanner(System.in);
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		int sum=number1+number2;
		System.out.println("Addtion of two number are :"+sum);
		
		//Multiplication
		int mul=number1*number2;
		System.out.println("Multiplication of "+number1+"&"+number2+"is : "+mul);
	}

}

package assignments_1;

import java.util.Scanner;

public class   ArithmeticOperationDemo{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter First Number...: ");
		String num1=scan.next();
		
		System.out.println("Please Enter Second Number...: ");
		String num2=scan.next();
		
		Calculator casio=new Calculator();
		int result=casio.add(Integer.parseInt(num1), Integer.parseInt(num2));
		System.out.println("The Addition of two numbers is...: "+result);
		
		
		int result2=casio.sub(Integer.parseInt(num1), Integer.parseInt(num2));
		System.out.println("The  Subtraction of two numbers is...: "+result2);
		
		
		int result3=casio.mul(Integer.parseInt(num1), Integer.parseInt(num2));
		System.out.println("The Multiplication of two numbers is...: "+result3);
	
		scan.close();
		
		
	}
}
	
class   Calculator{
	public int add(int i,int j) {
		return i+j;
	}
	
	public int sub(int i,int j) {
		return i-j;
	}
	
	public int mul(int i,int j) {
		return i*j;
	}
	
	
	
}
	
	


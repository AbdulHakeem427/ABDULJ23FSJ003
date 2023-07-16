package Week2LabBook;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=s.nextInt();
		if(num%2==0) {
			System.out.println(s+" is even number ");
		}
		else
			System.out.println(s+" odd number");
	}
}

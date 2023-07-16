package Week2LabBook;

import java.util.Scanner;

public class PyramidDemo {
	public static void main(String[] args) {
		
		pyramid(5);
		
		System.out.println(".............................\n");
		
		
		pyramid2(6);
	}
	
	static public void pyramid(int n) {
		for(int i=1;i<=n;i++){ 
			  for(int j=1;j<=i;j++){ 
			    System.out.print("* "); 
			   } 
			  System.out.println();//new line 
	 	} 
	 } 
	
	static public void pyramid2(int n) {
		for(int i=1;i<=n;i++){ 
			  for(int j=n;j>=i;j--){ 
			    System.out.print("* "); 
			   } 
			  System.out.println();//new line 
	 	} 
	 } 
	


			
}




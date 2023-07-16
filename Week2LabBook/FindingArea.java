package Week2LabBook;

import java.util.Scanner;

public class FindingArea {
	public static void main(String[] args) {
		areaOfRectangle();
		System.out.println("...................\n");
		
		areaOfSquare();
		System.out.println("...................\n");
		
		areaOfTriangle();
		System.out.println("...................\n");
		
		areaOfCircle();
		
	}
	
	static	Scanner scanner ;
	static public void areaOfRectangle() {
		scanner=new Scanner(System.in); 
	    System.out.println("Enter the length of Rectangle:"); 
	    
	    double length = scanner.nextDouble(); 
	    System.out.println("Enter the width of Rectangle:"); 
	       
	    double width = scanner.nextDouble(); 
	       //Area = length*width; 
	    double area = length*width; 
	    System.out.println("Area of Rectangle is:"+area);
	}
	
	static public void areaOfSquare() {
		System.out.println("Enter Side of Square:");
		//Storing the captured value in a variable 
	    double side = scanner.nextDouble(); 
	    //Area of Square = side*side 
	    double area = side*side;  
	    System.out.println("Area of Square is: "+area); 
	}
	
	static public void areaOfTriangle() {
		System.out.println("Enter the width of the Triangle:"); 
	    double base = scanner.nextDouble(); 
	
	    System.out.println("Enter the height of the Triangle:"); 
	    double height = scanner.nextDouble(); 
	
	    //Area = (width*height)/2 
	    double area = (base* height)/2; 
	    System.out.println("Area of Triangle is: " + area);
	}
	static public void areaOfCircle() {
		System.out.print("Enter the radius: "); 
	    /*We are storing the entered radius in double 
	     * because a user can enter radius in decimals 
	     */ 
	    double radius = scanner.nextDouble(); 
	    //Area = PI*radius*radius 
	    double area = Math.PI * (radius * radius); 
	    System.out.println("The area of circle is: " + area); 
	    //Circumference = 2*PI*radius 
	    double circumference= Math.PI * 2*radius; 
	    System.out.println( "The circumference of the circle is:"+circumference) ; 
	}
}
package LabBookCoreJava;

public class Lab3 {
	public static void main(String[] args) {
		
		        // Declaration and Initialization of Primitive Data Type
		        // byte,short, int ,float, double, char,boolean
		        byte byteVar = 100;
		        short shortVar = 20000;
		        int intVar = 300000;
		        long longVar = 4000000000L;
		        float floatVar = 3.14f;
		        double doubleVar = 3.14159;
		        char charVar = 'A';
		        boolean booleanVar = true;

		        // Implicit Type Casting
		        shortVar = byteVar;
		        intVar = shortVar; 
		        longVar = intVar; 
		        doubleVar = floatVar;
		        
		        
		        // Explicit Type Casting
		        intVar = (int) longVar; 
		        floatVar = (float) doubleVar; // double needs explicit cast to float
		        intVar = charVar;// char can be implicitly cast to int

		        // Printing the values of variables
		        System.out.println("byteVar: " + byteVar);
		        System.out.println("shortVar: " + shortVar);
		        System.out.println("intVar: " + intVar);
		        System.out.println("longVar: " + longVar);
		        System.out.println("floatVar: " + floatVar);
		        System.out.println("doubleVar: " + doubleVar);
		        System.out.println("charVar: " + charVar);
		        System.out.println("booleanVar: " + booleanVar);

	}

}

package assignments_1;

import java.util.Scanner;
	
class   Calculator{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter First Number...: ");
		String num1=scan.next();
		
		System.out.println("Please Enter Second Number...: ");
		String num2=scan.next();
		
	
		Calculator casio=new Calculator();
		casio.add(num1, num2);
		casio.sub(num1, num2);
		casio.mul(num1, num2);
		casio.div(num1, num2);
		//casio.modulus(num1, num2);
		
		scan.close();
		
	}
	
	public String add(String i,String j) {
		int result=Integer.parseInt(i)+Integer.parseInt(j);
		System.out.println("The Additon of "+i+"and"+j+" is..:"+result);
		
		return  "result";
	}
	
	public String sub(String i,String j) {
		int result=Integer.parseInt(i)-Integer.parseInt(j);
		System.out.println("The Subtraction of "+i+"and"+j+"  is..:"+result);
		
		return  "result";
	}
	
	public String mul(String i,String j) {
		int result=Integer.parseInt(i)*Integer.parseInt(j);
		System.out.println("The Multipication of "+i+"and"+j+"  is..:"+result);
		
		return  "result";
	}
	
//	public String division(String i,String j) {
//		int result;
//		try {
//		result=Integer.parseInt(i)/Integer.parseInt(j);
//		System.out.println("The Division of "+i+"and"+j+"  is..:"+result);
//		}catch(ArithmeticException e3) {
//			System.out.println("Please Enter a value other than Zero..: ");
//		}catch(NumberFormatException ee4) {
//			System.out.println("Please enter a valid number, not alphabets");
//		}
//		return  "result";
//	}
	
	public String div(String i,String j) {
		int result;
		int n=Integer.parseInt(j);
		if(n>0) {
			 result=Integer.parseInt(j)/Integer.parseInt(j);
		}else {
			System.out.println("Please enter a value other thean zero");
		}
		
		
		
		return "result";
	}
	

}
	
	


	
	
}
	
	


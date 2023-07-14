package assignments_1;

import java.util.Scanner;
	
class   Calculator{
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please Enter First Number...: ");
//		String num1=scan.next();
//		
//		System.out.println("Please Enter Second Number...: ");
//		String num2=scan.next();
//		
//	
//		Calculator casio=new Calculator();
//		casio.add(num1, num2);
//		casio.sub(num1, num2);
//		casio.mul(num1, num2);
//	//	casio.div(num1, num2);
//		
//		
//		scan.close();
//		
//	}
	
	public Integer add(String i,String j) {
		int result=Integer.parseInt(i)+Integer.parseInt(j);
		System.out.println("The Additon of "+i+"and"+j+" is..:"+result);
		
		return  result;
	}
	
	public int sub(String i,String j) {
		int result=Integer.parseInt(i)-Integer.parseInt(j);
		System.out.println("The Subtraction of "+i+"and"+j+"  is..:"+result);
		
		return  result;
	}
	
	public int mul(String i,String j) {
		int result=Integer.parseInt(i)*Integer.parseInt(j);
		System.out.println("The Multipication of "+i+"and"+j+"  is..:"+result);
		
		return  result;
	}
	
	public double div(int i,int j) {
		double result = 0;
		 if (j != 0) {
	            result = i / j;
	           // return result;
	        } else {
	            System.out.println(" Please enter a valid number, division by zero is not allowed..");
	        }
		return result;
		
		}

	    public  double calculatePower(double base, int exponent) {
	        double result = 1;

	        if (exponent >= 0) {
	            for (int i = 1; i <= exponent; i++) {
	                result *= base;
	            }
	        } else {
	            for (int i = -1; i >= exponent; i--) {
	                result /= base;
	            }
	        }

	        return result;
	    }
	    
	    public Integer modulus(String i,String j) {
			int result=Integer.parseInt(i)%Integer.parseInt(j);
			if(Integer.parseInt(j)<0){
					j="1";
			}
			
			
			System.out.println("The Modulus of "+i+"and"+j+" is..:"+result);
			
			return  result;
		}
	}


	

	
	




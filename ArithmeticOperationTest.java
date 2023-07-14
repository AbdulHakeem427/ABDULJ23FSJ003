package assignments_1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import assignments_1_Bonus.SquareRoot;


public class ArithmeticOperationTest {
	

	@Test

	public void testadd() {
		Calculator calc=new Calculator();
		int result=calc.add("5", "4");
		
		assertEquals(9,result);
	}
	
	
	
	
	
	@Test
	public void testsub() {
		Calculator calc=new Calculator();
		int result=calc.sub("-4", "4");
		
		
		assertEquals(-8,result);
	}
	
	@Test
	public void testsub2() {
		Calculator calc=new Calculator();
		int result=calc.sub("-4", "-4");
		
		
		assertEquals(0,result);
	}
	
	@Test
	
	public void testmul() {
		Calculator calc=new Calculator();
		int result=calc.mul("4", "4");
		
		
		assertEquals(16,result);
		
		
	}
	
	@Test
	public void testMul() {
		Calculator calc=new Calculator();
		int result=calc.mul("-4", "4");
		
		
		assertEquals(-16,result);
	}
	@Test
	public void testMul2() {
		Calculator calc=new Calculator();
		int result=calc.mul("-0", "4");
		
		
		assertEquals(0,result);
	}
	
	@Test
	public void testMul3() {
		Calculator calc=new Calculator();
		int result=calc.mul("4", "0");
		
		
		assertEquals(0,result);
	}
	

	@Test
	public void testDiv() {
		Calculator calc=new Calculator();
	double result=calc.div(0, 2);
	assertEquals(0, result);
	}
	
	@Test
	public void testDiv2() {
		Calculator calc=new Calculator();
	double result=calc.div(3, 3);
	assertEquals(1, result);
	}
	
	
	
	
	
	
	@Test
	public void testDiv3() {
		Calculator calc=new Calculator();
	double result=calc.div(4, 0);
	assertEquals(" Please enter a valid number, division by zero is not allowed..", result);
	}
	
	@Test
	public void testPowerCal() {
	Calculator calc=new Calculator();
	double result=calc.calculatePower(2, 3);
	assertEquals(8.0, result);
	}
	
	@Test
	public void testPowerCal2() {
	Calculator calc=new Calculator();
	double result=calc.calculatePower(2, -5);
	assertEquals(0.03125, result);
	}
	
	@Test
	public void testModulus() {
		Calculator calc=new Calculator();
		int result=calc.modulus("5", "4");
		
		assertEquals(1,result);	
	}
	
	@Test
	public void testModulus2() {
		Calculator calc=new Calculator();
		int result=calc.modulus("4", "4");
		
		assertEquals(0,result);	
	}
	@Test
	public void testModulus3() {
		Calculator calc=new Calculator();
		int result=calc.modulus("4", "5");
		
		assertEquals(4,result);	
	}
	@Test
	public void testModulus4() {
		Calculator calc=new Calculator();
		int result=calc.modulus("0", "5");
		
		assertEquals(0,result);	
	}
	@Test
	public void testModulus5() {
		Calculator calc=new Calculator();
		int result=calc.modulus("4", "-14");
		
		assertEquals(4,result);	
	}
	@Test
	public void testModulus6() {
		Calculator calc=new Calculator();
		int result=calc.modulus("8", "1");
		
		assertEquals(0,result);	
	}
	
	
	//Bonus assignment....................
	@Test
	public void testSquareRoot() {
		SquareRoot sr=new SquareRoot();
		double result=sr.square(-2);
		
		assertEquals(-1.14,result);	
	}
	@Test
	public void testSquareRoot2() {
		SquareRoot sr=new SquareRoot();
		double result=sr.square(16);
		
		assertEquals(4,result);	
	}
	
	
	
}

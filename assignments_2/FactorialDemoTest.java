package assignments_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialDemoTest {

	@Test
	public void testFact() {
		FactorialDemo fd=new FactorialDemo();
		int result=fd.calcfactorial(5); 
		
		assertEquals(120, result);
	}
	
	@Test
	public void testFact2() {
		FactorialDemo fd=new FactorialDemo();
		int result=fd.calcfactorial(1); 
		
		assertEquals(1, result);
	}
	
	@Test
	public void testFact3() {
		FactorialDemo fd=new FactorialDemo();
		int result=fd.calcfactorial(0); 
		
		assertEquals(1, result);
	}

	

}

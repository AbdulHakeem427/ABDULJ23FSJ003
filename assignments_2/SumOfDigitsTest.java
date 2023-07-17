package assignments_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfDigitsTest {

	@Test
	public void test() {
		int result=SumOfDigits.calculateSumOfDigits(101042);
		assertEquals(8, result);
	}

}

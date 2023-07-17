package assignments_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testPalind() {
		boolean str=Palindrome.isPalindrome("mom");
	}
	@Test
	public void testPalind2() {
		boolean str=Palindrome.isPalindrome("abdul");
	}

	@Test
	public void testPalind3() {
		boolean str=Palindrome.isPalindrome("");
	}
	
	@Test
	public void testPalind4() {
		boolean str=Palindrome.isPalindrome("aleem hakeem");
	}



}

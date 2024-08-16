/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test9Palindrome {

	@Test
	void testIsPalindrome() {
		int[] nums = {0, 1, 101, 2332, 56788765, 10101};
		for(int num : nums) {
			assertTrue(Problem9Palindrome.isPalindrome(num));
		}
	}

	@Test
	void testIsNotPalindrome() {
		int[] nums = {-1, 1010, 112, 211};
		for(int num : nums) {
			assertFalse(Problem9Palindrome.isPalindrome(num));
		}
	}
}

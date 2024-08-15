/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test5LongestPalindrome {

	@Test
	void testLongestPalindrome() {
		assertEquals("", Problem5LongestPalindrome.longestPalindrome(""));
		assertEquals("a", Problem5LongestPalindrome.longestPalindrome("a"));
		assertEquals("bb", Problem5LongestPalindrome.longestPalindrome("bb"));
		assertEquals("ababa", Problem5LongestPalindrome.longestPalindrome("ababa"));
		assertEquals("ababa", Problem5LongestPalindrome.longestPalindrome("abcbcbbabba"));
		assertEquals("ddtattarrattatdd", Problem5LongestPalindrome.longestPalindrome("babaddtattarrattatddetartrateedredb"));
	}

}

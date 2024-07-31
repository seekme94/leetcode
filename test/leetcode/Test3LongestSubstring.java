/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test3LongestSubstring {

	/**
	 * Test method for {@link leetcode.Problem3LongestSubstring#lengthOfLongestSubstring(java.lang.String)}.
	 */
	@Test
	void testLengthOfLongestSubstring() {
		assertEquals(Problem3LongestSubstring.lengthOfLongestSubstring(""), 0);
		assertEquals(Problem3LongestSubstring.lengthOfLongestSubstring(" "), 1);
		assertEquals(Problem3LongestSubstring.lengthOfLongestSubstring("abc"), 3);
		assertEquals(Problem3LongestSubstring.lengthOfLongestSubstring("abab"), 2);
		assertEquals(Problem3LongestSubstring.lengthOfLongestSubstring("aabbcc"), 2);
		assertEquals(Problem3LongestSubstring.lengthOfLongestSubstring("bbbbb"), 1);
		assertEquals(Problem3LongestSubstring.lengthOfLongestSubstring("aabbabc"), 3);
		assertEquals(Problem3LongestSubstring.lengthOfLongestSubstring("abcdabcddcba"), 4);
	}

}

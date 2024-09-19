/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test17PhoneLetterCombinations {

	@Test
	void testEmpty() {
		List<String> list = Problem17PhoneLetterCombinations.letterCombinations("");
		assertTrue(list.isEmpty());
	}

	@Test
	void testSingleDigit() {
		List<String> list = Problem17PhoneLetterCombinations.letterCombinations("2");
		assertEquals(3, list.size());
		assertTrue(list.contains("a") && list.contains("b") && list.contains("c"));
		list.clear();
		list = Problem17PhoneLetterCombinations.letterCombinations("9");
		assertTrue(list.contains("z"));
	}
	
	@Test
	void testTwoDigits() {
		List<String> list = Problem17PhoneLetterCombinations.letterCombinations("23");
		assertEquals(9, list.size());
		String[] should = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
		for (String s : should) {
			assertTrue(list.contains(s));
		}
	}
	
	@Test
	void testFourDigits() {
		List<String> list = Problem17PhoneLetterCombinations.letterCombinations("2345");
		assertEquals(81, list.size());
	}
}

/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test13RomanToInteger {

	@Test
	void testSingleCharacter() {
		assertEquals(1, Problem13RomanToInteger.romanToInt("I"));
		assertEquals(5, Problem13RomanToInteger.romanToInt("V"));
		assertEquals(10, Problem13RomanToInteger.romanToInt("X"));
		assertEquals(50, Problem13RomanToInteger.romanToInt("L"));
		assertEquals(100, Problem13RomanToInteger.romanToInt("C"));
		assertEquals(500, Problem13RomanToInteger.romanToInt("D"));
		assertEquals(1000, Problem13RomanToInteger.romanToInt("M"));
	}

	@Test
	void testForwardOnly() {
		assertEquals(3, Problem13RomanToInteger.romanToInt("III"));
		assertEquals(7, Problem13RomanToInteger.romanToInt("VII"));
		assertEquals(15, Problem13RomanToInteger.romanToInt("XV"));
		assertEquals(1066, Problem13RomanToInteger.romanToInt("MLXVI"));
	}

	@Test
	void testNegatingNumbers() {
		assertEquals(4, Problem13RomanToInteger.romanToInt("IV"));
		assertEquals(9, Problem13RomanToInteger.romanToInt("IX"));
		assertEquals(999, Problem13RomanToInteger.romanToInt("IM"));
		assertEquals(14, Problem13RomanToInteger.romanToInt("XIV"));
		assertEquals(1994, Problem13RomanToInteger.romanToInt("MCMXCIV"));
	}
}

/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test12IntegerToRoman {

	@Test
	void testSingleCharacter() {
		assertEquals("I", Problem12IntegerToRoman.intToRoman(1));
		assertEquals("V", Problem12IntegerToRoman.intToRoman(5));
		assertEquals("X", Problem12IntegerToRoman.intToRoman(10));
		assertEquals("L", Problem12IntegerToRoman.intToRoman(50));
		assertEquals("C", Problem12IntegerToRoman.intToRoman(100));
		assertEquals("D", Problem12IntegerToRoman.intToRoman(500));
		assertEquals("M", Problem12IntegerToRoman.intToRoman(1000));
	}

	@Test
	void testComposite() {
		assertEquals("III", Problem12IntegerToRoman.intToRoman(3));
		assertEquals("VII", Problem12IntegerToRoman.intToRoman(7));
		assertEquals("XV", Problem12IntegerToRoman.intToRoman(15));
		assertEquals("CCLXV", Problem12IntegerToRoman.intToRoman(265));
		assertEquals("MLXVI", Problem12IntegerToRoman.intToRoman(1066));
	}

	@Test
	void testComplexCompositions() {
		assertEquals("IV", Problem12IntegerToRoman.intToRoman(4));
		assertEquals("IX", Problem12IntegerToRoman.intToRoman(9));
		assertEquals("XL", Problem12IntegerToRoman.intToRoman(40));
		assertEquals("XC", Problem12IntegerToRoman.intToRoman(90));
		assertEquals("CD", Problem12IntegerToRoman.intToRoman(400));
		assertEquals("CM", Problem12IntegerToRoman.intToRoman(900));
		assertEquals("MCMXCIV", Problem12IntegerToRoman.intToRoman(1994));
	}
}

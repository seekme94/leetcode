/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test8StringToInteger {

		
	@Test
	void testStringToInteger() {
		assertEquals(0, Problem8StringToInteger.myAtoi("0"));
	}
	
	@Test
	void testIgnoreLeadingWhitespaces() {
		assertEquals(1, Problem8StringToInteger.myAtoi("1 "));
		assertEquals(1, Problem8StringToInteger.myAtoi(" 1"));
	}

	@Test
	void testSignedString() {
		assertEquals(123, Problem8StringToInteger.myAtoi("123"));
		assertEquals(-123, Problem8StringToInteger.myAtoi("-123"));
		assertEquals(+123, Problem8StringToInteger.myAtoi("+123"));
		assertEquals(0, Problem8StringToInteger.myAtoi("+"));
		assertEquals(0, Problem8StringToInteger.myAtoi("0-1"));
	}

	@Test
	void testSkipLeadingZeros() {
		assertEquals(0, Problem8StringToInteger.myAtoi("000"));
		assertEquals(10, Problem8StringToInteger.myAtoi("00010"));
	}
	
	@Test
	void testRoundingOutOfRange() {
		int max = Problem8StringToInteger.myAtoi("2147483648");
		assertEquals(Integer.MAX_VALUE, max);
		int min = Problem8StringToInteger.myAtoi("-2147483649");
		assertEquals(Integer.MIN_VALUE, min);
	}
	
	@Test
	void testMinMax() {
		int min = (int)Math.pow(2, 31) * -1;
		assertEquals(Integer.MIN_VALUE, Problem8StringToInteger.myAtoi(String.valueOf(min)));
		int max = (int)Math.pow(2, 31) - 1;
		assertEquals(Integer.MAX_VALUE, Problem8StringToInteger.myAtoi(String.valueOf(max)));
	}
}

/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test67AddBinary {

	@Test
	void testSingleWithoutCarry() {
		assertEquals("1", Problem67AddBinary.addBinary("1", "0"));
		assertEquals("0", Problem67AddBinary.addBinary("0", "0"));
	}

	@Test
	void testSingleWithCarry() {
		assertEquals("10", Problem67AddBinary.addBinary("1", "1"));
	}

	@Test
	void testMultiWithoutCarry() {
		assertEquals("11", Problem67AddBinary.addBinary("10", "01"));
	}

	@Test
	void testMultiWithCarry() {
		assertEquals("100", Problem67AddBinary.addBinary("10", "10"));
	}

	@Test
	void testDifferentLengthsWithoutCarry() {
		assertEquals("1011", Problem67AddBinary.addBinary("1000", "11"));
	}

	@Test
	void testDifferentLengthsWithCarry() {
		assertEquals("10000", Problem67AddBinary.addBinary("1100", "100"));
	}
}

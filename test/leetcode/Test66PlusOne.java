/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test66PlusOne {

	@Test
	void testEmpty() {
		int[] empty = {};
		assertArrayEquals(empty, Problem66PlusOne.plusOne(empty));
	}

	@Test
	void testSingle() {
		int[] digits = {0};
		int[] expected = {1};
		assertArrayEquals(expected, Problem66PlusOne.plusOne(digits));
	}

	@Test
	void testMultiple() {
		int[] digits = {5, 4, 2};
		int[] expected = {5, 4, 3};
		assertArrayEquals(expected, Problem66PlusOne.plusOne(digits));
	}

	@Test
	void testComplex() {
		int[] digits = {5, 4, 9};
		int[] expected = {5, 5, 0};
		assertArrayEquals(expected, Problem66PlusOne.plusOne(digits));
	}

	@Test
	void testExtendArray() {
		int[] digits = {9, 9};
		int[] expected = {1, 0, 0};
		assertArrayEquals(expected, Problem66PlusOne.plusOne(digits));
	}
}

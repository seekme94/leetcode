/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test27RemoveElement {

	@Test
	void testNone() {
		int[] nums = {};
		assertEquals(0, Problem27RemoveElement.removeElement(nums, 0));
	}

	@Test
	void testNonExisting() {
		int[] nums = {2};
		assertEquals(1, Problem27RemoveElement.removeElement(nums, 0));
	}

	@Test
	void testFirst() {
		int[] nums = { 1, 2, 3 };
		assertEquals(2, Problem27RemoveElement.removeElement(nums, 1));
	}

	@Test
	void testLast() {
		int[] nums = { 1, 2, 3, 4 };
		assertEquals(3, Problem27RemoveElement.removeElement(nums, 4));
	}

	@Test
	void testMultiple() {
		int[] nums = { 1, 2, 3, 3, 3, 4 };
		assertEquals(3, Problem27RemoveElement.removeElement(nums, 3));
	}

	@Test
	void testRandom() {
		int[] nums = { 3, 9, 1, 3, 2, 4, 3, 4 };
		assertEquals(5, Problem27RemoveElement.removeElement(nums, 3));
	}
}

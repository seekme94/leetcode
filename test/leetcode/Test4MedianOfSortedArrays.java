/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test4MedianOfSortedArrays {

	@Test
	void testFindMedianSortedArrays() {
		assertEquals(-1.0, Problem4MedianOfSortedArrays.findMedianSortedArrays(null, null));
		assertEquals(-1.0, Problem4MedianOfSortedArrays.findMedianSortedArrays(new int[] {}, new int[] {}));
		assertEquals(2.0, Problem4MedianOfSortedArrays.findMedianSortedArrays(new int[] {1, 2, 3}, new int[] {}));
		assertEquals(2.5, Problem4MedianOfSortedArrays.findMedianSortedArrays(new int[] {1, 2, 3, 4}, new int[] {}));
		assertEquals(3.5, Problem4MedianOfSortedArrays.findMedianSortedArrays(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
		assertEquals(3.5, Problem4MedianOfSortedArrays.findMedianSortedArrays(new int[] {4, 5, 6}, new int[] {1, 2, 3}));
		assertEquals(4,5, Problem4MedianOfSortedArrays.findMedianSortedArrays(new int[] {4, 5, 6, 7, 8}, new int[] {1, 2, 3}));
		assertEquals(4.5, Problem4MedianOfSortedArrays.findMedianSortedArrays(new int[] {7, 8}, new int[] {1, 2, 3, 4, 5, 6}));
	}

}

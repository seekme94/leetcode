/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test26RemoveDuplicatesFromSortedArray {

	@Test
	void testOne() {
		assertEquals(1, Problem26RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {0}));
		assertEquals(1, Problem26RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {5, 5, 5, 5, 5}));
	}

	@Test
	void testUnique() {
		assertEquals(3, Problem26RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {0, 1, 2}));
	}

	@Test
	void testDuplicates() {
		assertEquals(2, Problem26RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {1, 1, 2}));
		assertEquals(3, Problem26RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {1, 1, 2, 2, 3, 3}));
	}

	@Test
	void testTriplicatesAnQuadruplets() {
		assertEquals(4, Problem26RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}));
	}

	@Test
	void testLarge() {
		List<Integer> list = new ArrayList<Integer>();
		int range = 100;
		for (int i = 1; i <= range; i++) {
			for (int j = 1; j <= i; j++) {
				list.add(i);				
			}
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		assertEquals(range, Problem26RemoveDuplicatesFromSortedArray.removeDuplicates(arr));
	}
}

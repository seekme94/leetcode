/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test16ThreeSumClosest {

	@Test
	void testEmpty() {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		assertEquals(list, Problem15ThreeSum.threeSum(new int[] {}));
	}

	@Test
	void testSingle() {
		int[] input = {0, 0, 0};
		assertEquals(0, Problem16ThreeSumClosest.threeSumClosest(input, 0));

		input = new int[] {-1, 0, 1};
		assertEquals(0, Problem16ThreeSumClosest.threeSumClosest(input, 1));

		input = new int[] {-3, -2, -5};
		assertEquals(-10, Problem16ThreeSumClosest.threeSumClosest(input, 3));
	}
	
	@Test
	void testMany() {
		int[] input = new int[] {-1, 2, 1, -4};
		assertEquals(2, Problem16ThreeSumClosest.threeSumClosest(input, 1));

		input = new int[] {1, 1, 1, 1};
		assertEquals(3, Problem16ThreeSumClosest.threeSumClosest(input, 3));
		
		input = new int[] {0, 3, 97, 102, 200};
		assertEquals(300, Problem16ThreeSumClosest.threeSumClosest(input, 300));

		input = new int[] {-4, 2, 2, 3, 3, 3};
		assertEquals(0, Problem16ThreeSumClosest.threeSumClosest(input, 0));

		input = new int[] {4, 0, 5, -5, 3, 3, 0, -4, -5};
		input = new int[] {-5, -5, -4, 0, 0, 3, 3, 4, 5};
		assertEquals(-2, Problem16ThreeSumClosest.threeSumClosest(input, -2));
	}
}

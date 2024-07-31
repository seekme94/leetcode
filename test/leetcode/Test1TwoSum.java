/**
 * 
 */
package leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test1TwoSum {

	@Test
	void test() {
		
		int[] indices = Problem1TwoSum.twoSum(new int[] {2,7,11,15}, 9);
		assertArrayEquals(new int[] {0, 1}, indices);
		
	}

}

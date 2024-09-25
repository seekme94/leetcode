/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test18FourSum {

	@Test
	void testInvald() {
		int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
		List<List<Integer>> list = Problem18FourSum.fourSum(nums, -294967296);
		assertEquals(0, list.size());
	}
	
	@Test
	void testOne() {
		int[] nums = {2, 2, 2, 2};
		List<List<Integer>> list = Problem18FourSum.fourSum(nums, 8);
		assertEquals(1, list.size());
		List<Integer> candidate = list.get(0);
		int sum = candidate.stream().reduce(0, (a, b) -> a + b);
		assertEquals(8, sum);
	}

	@Test
	void testTwo() {
		int[] nums = {2, 3, 4, 5, 6};
		List<List<Integer>> list = Problem18FourSum.fourSum(nums, 16);
		assertEquals(1, list.size());
		List<Integer> candidate = list.get(0);
		int sum = candidate.stream().reduce(0, (a, b) -> a + b);
		assertEquals(16, sum);
	}
	
	@Test
	void testThree() {
		int[] nums = {1, 0, -1, 0, -2, 2};
		List<List<Integer>> list = Problem18FourSum.fourSum(nums, 0);
		assertEquals(3, list.size());
		for (int i = 0; i < list.size(); i++) {
			List<Integer> candidate = list.get(i);
			int sum = candidate.stream().reduce(0, (a, b) -> a + b);
			assertEquals(0, sum);
		}
	}
	
	@Test
	void testFour() {
		int[] nums = {-3, -1, 0, 2, 4, 5};	// -3,-1,0,4
		List<List<Integer>> list = Problem18FourSum.fourSum(nums, 0);
		assertEquals(1, list.size());
		for (int i = 0; i < list.size(); i++) {
			List<Integer> candidate = list.get(i);
			int sum = candidate.stream().reduce(0, (a, b) -> a + b);
			assertEquals(0, sum);
		}
	}
	
	@Test
	void testComplex() {
		int[] nums = {-3, -2, -1, 0, 0, 1, 2, 3};
		// Possibilities [-2,0,0,2], [-3,-1,1,3], [-3,0,1,2], [-3,0,0,3], [-2,-1,1,2], [-1,0,0,1], [-3,-2,2,3], [-2,-1,0,3]
		List<List<Integer>> list = Problem18FourSum.fourSum(nums, 0);
		for (int i = 0; i < list.size(); i++) {
			List<Integer> candidate = list.get(i);
			int sum = candidate.stream().reduce(0, (a, b) -> a + b);
			assertEquals(0, sum);
		}
		
		nums = new int[] {0, 0, 0, 1000000000, 1000000000, 1000000000, 1000000000};
		list = Problem18FourSum.fourSum(nums, 1000000000);
		List<Integer> candidate = list.get(0);
		int sum = candidate.stream().reduce(0, (a, b) -> a + b);
		assertEquals(1000000000, sum);
		
		nums = new int[] {1, -2, -5, -4, -3, 3, 3, 5};
		list = Problem18FourSum.fourSum(nums, -11);
		candidate = list.get(0);
		sum = candidate.stream().reduce(0, (a, b) -> a + b);
		assertEquals(-11, sum);
	}
	
	@Test
	void testComplex2() {
		int[] nums = {-1000000000, -1000000000, 1000000000, -1000000000, -1000000000};
		assertEquals(0, Problem18FourSum.fourSum(nums, 294967296).size());
	}
}

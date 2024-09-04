/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test15ThreeSum {

	@Test
	void testEmpty() {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		assertEquals(list, Problem15ThreeSum.threeSum(new int[] {}));
	}

	@Test
	void testSingle() {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] input = {0, 0, 0};
		List<Integer> single = new ArrayList<Integer>();
		single.addAll(Arrays.asList(new Integer[] {0, 0, 0}));
		list.add(single);
		assertEquals(list, Problem15ThreeSum.threeSum(input));
		list.clear();
		single.clear();

		input = new int[] {-1, 0, 1};
		single.addAll(Arrays.asList(new Integer[] {-1, 0, 1}));
		list.add(single);
		assertEquals(list, Problem15ThreeSum.threeSum(input));
		list.clear();
		single.clear();

		input = new int[] {-3, -2, 5};
		single.addAll(Arrays.asList(new Integer[] {-3, -2, 5}));
		list.add(single);
		assertEquals(list, Problem15ThreeSum.threeSum(input));
	}
	
	@Test
	void testMany() {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] input = {-1, 0, 1, 2, -1, -4};
		List<Integer> first = Arrays.asList(new Integer[] {-1, -1, 2});
		List<Integer> second = Arrays.asList(new Integer[] {-1, 0, 1});
		list.add(first);
		list.add(second);
		assertEquals(list, Problem15ThreeSum.threeSum(input));
		
		list.clear();
		input = new int[] {-2, 0, 1, 1, 2};
		first = Arrays.asList(new Integer[] {-2, 0, 2});
		second = Arrays.asList(new Integer[] {-2, 1, 1});
		list.add(first);
		list.add(second);
		assertTrue(Problem15ThreeSum.threeSum(input).contains(first));
		assertTrue(Problem15ThreeSum.threeSum(input).contains(second));
	}
}

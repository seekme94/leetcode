/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class Problem18FourSum {
	
	/**
	 * Given an array nums of n integers, return a list of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
	 * 0 <= a, b, c, d < n
	 * a, b, c, and d are distinct
	 * nums[a] + nums[b] + nums[c] + nums[d] == target
	 * Tip! The answer can be in any order.
	 * 
	 * Constraints!
	 * 1 <= nums.length <= 200
	 * -109 <= nums[i] <= 109
	 * -109 <= target <= 109
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static java.util.List<java.util.List<Integer>> fourSum(int[] nums, int target) {
		// Handle validations
		ArrayList<List<Integer>> empty = new ArrayList<List<Integer>>();
		if (null == nums || nums.length < 1 || nums.length > 200) {
			return empty;
		}
		int limit = 1000000000;
		if (target < -limit || target > limit) {
			return empty;
		}
		boolean hasNegative = false, hasPositive = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < -limit || nums[i] > limit) {
				return empty;
			}
			if (nums[i] < 0) {
				hasNegative = true;
			}
			if (nums[i] > 0) {
				hasPositive = true;
			}
		}
		if (target < 0 && !hasNegative) {
			return empty;
		}
		if (target > 0 && !hasPositive) {
			return empty;
		}
		// Sort the array
		Arrays.sort(nums);
		// Use a set to ensure uniqueness
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int a = 0; a < nums.length - 2; a++) {
			for (int d = nums.length - 1; d > a + 2; d--) {
				int b = a + 1;
				int c = d - 1;
				long presum = nums[a] + nums[d];
				// Iterate until either the middle pointers meet or the solution is found
				while (b < c) {
					long sum = presum + nums[b] + nums[c];
// System.out.println(String.format("a=%d:%d; b=%d:%d; c=%d:%d; d=%d:%d; sum=%d", a, nums[a], b, nums[b], c, nums[c], d, nums[d], sum));
					if (sum == target) {
						List<Integer> entry = new ArrayList<Integer>();
						entry.add(nums[a]);
						entry.add(nums[b]);
						entry.add(nums[c]);
						entry.add(nums[d]);
						set.add(entry);
						b++;
						c--;
					} else if (sum > target) {
						c--;
					} else {
						b++;
					}
				}
			}
		}
        return new ArrayList<List<Integer>>(set);
    }
}

/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class Problem15ThreeSum {

	/**
	 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
	 * Notice that the solution set must not contain duplicate triplets.
	 * Constraints:
	 * 3 <= nums.length <= 3000
	 * -105 <= nums[i] <= 105
	 * 
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		if (nums == null) {
			return new ArrayList<List<Integer>>(set);
		}
		if (nums.length < 3 || nums.length > 3000) {
			return new ArrayList<List<Integer>>(set);
		}
		for (int num : nums) {
			if (num < -1000000 || num > 1000000) {
				return new ArrayList<List<Integer>>(set);
			}
		}
		System.out.println("Sorting the array of length: " + nums.length);
		// Sort the array
		java.util.Arrays.sort(nums);
		int i = 0;
		while (i < nums.length) {
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) {
					java.util.ArrayList<Integer> temp = new java.util.ArrayList<Integer>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					set.add(temp);
					j++;
					k--;
				} else if (sum > 0) {
					k--;
				} else {
					j++;
				}
			}
			i++;
		}
		return new ArrayList<List<Integer>>(set);
    }
	
}

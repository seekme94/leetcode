/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem16ThreeSumClosest {
	/**
	 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target. 
	 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
	 * 
	 * Constraints:
	 * 3 <= nums.length <= 500
	 * -1000 <= nums[i] <= 1000
	 * -104 <= target <= 104
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int threeSumClosest(int[] nums, int target) {
		// Check constraints
		if (nums == null) {
			return Integer.MAX_VALUE;
		}
		if (nums.length < 3 || nums.length > 500 || target < -10000 || target > 10000) {
			return Integer.MAX_VALUE;
		}
		if (nums.length == 3) {
			return nums[0] + nums[1] + nums[2];
		}
		for (int num : nums) {
			if (num < -1000 || num > 1000) {
				return Integer.MAX_VALUE;
			}
		}
		int i = 0;
		int closestDiff = Integer.MAX_VALUE;
		int closestSum = Integer.MAX_VALUE;
		java.util.Arrays.sort(nums);
		while (i < nums.length) {
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int diff = target > sum ? target - sum : sum - target;
				// If both are equal, then return
				if (sum == target) {
					return sum;
				} else {
					// Has the difference reduced?
					if (diff < closestDiff) {
						closestSum = sum;
						closestDiff = diff;
					}
					if (target > sum) {
						j++;
					} else {
						k--;
					}
				}
			}
			i++;
		}		
        return closestSum;
    }
}

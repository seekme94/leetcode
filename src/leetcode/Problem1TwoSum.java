/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem1TwoSum {

	/**
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice. 
	 * You can return the answer in any order.
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		if (nums == null)
			return null;
		if (nums.length == 0)
			return null;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println(nums[i] + " and " + nums[j] + " make " + target);
					return new int[] {i, j};
				}
			}
		}
		return null;
	}
}

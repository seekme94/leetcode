/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem26RemoveDuplicatesFromSortedArray {

	/**
	 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
	 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums. 
	 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things: 
	 * 	Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
	 * 	The remaining elements of nums are not important as well as the size of nums.
	 * 	Return k.
	 * 
	 * Constraints:
	 *  1 <= nums.length <= 3 * 10^4
	 *  -100 <= nums[i] <= 100
	 *  nums is sorted in non-decreasing order.

	 * @param nums
	 * @return
	 */
	public static int removeDuplicates(int[] nums) {
		// Handle constraints
		if (nums == null || nums.length < 1 || nums.length > 30000) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int i = 0, j = 1, k = 0;
		while (j < nums.length - k - 1) {
			if (nums[i] != nums[j]) {
				i++;
				j++;
				continue;
			}
			int jumps = 0;
			while (nums[i] == nums[j + jumps] && (j + jumps) < nums.length - k - 1) {
				jumps++;
			}
			for (int l = j; l + jumps <= nums.length - k - 1; l++) {
				nums[l] = nums[l + jumps];
			}
    		k += jumps;
		}
		if (nums[i] == nums[j]) {
			k++;
		}
        return nums.length - k;
    }
}

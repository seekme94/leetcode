/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * 
 */
public class Problem27RemoveElement {
	
	/**
	 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
	 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val. 
	 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
	 * 	Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
	 * 	The remaining elements of nums are not important as well as the size of nums.
	 * 	Return k.
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		}
		// Start from first element, if it is val, then swap with the last element. Increase this and decrease that
		int i = 0, j = nums.length - 1;
		while (i < j) {
			if (nums[i] == val) {
				nums[i] = nums[j];
				nums[j] = val;
				j--;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(nums));
		if (nums[i] == val) {
			return i;
		}
		while (i < nums.length && nums[i] != val) {
			i++;
		}
		return i;
    }
}

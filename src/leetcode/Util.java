/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Util {

	/**
	 * Sums up numbers in an array
	 * 
	 * @param nums
	 * @return
	 */
	public static int sum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	/**
	 * Returns a sub-array of an array
	 * 
	 * @param arr
	 * @param from
	 * @param to
	 * @return
	 */
	public static int[] subarray(int[] arr, int from, int to) {
		if (to > arr.length || from < 0 || to - from > arr.length) {
			return null;
		}
		int[] target = new int[to - from];
		for (int i = 0; i < target.length; i++) {
			target[i] = arr[from + i];
		}
		return target;
	}

	/**
	 * Merges two arrays into one
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			merged[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			merged[arr1.length + i] = arr2[i];
		}
		return merged;
	}

}

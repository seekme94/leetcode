/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem4MedianOfSortedArrays {

	/**
	 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. 
	 * The overall run time complexity should be O(log (m+n)).
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		// Handle empty and null cases
		if (nums1 == null || nums2 == null) {
			return -1;
		}
		if (nums1.length == 0 && nums2.length == 0) {
			return -1;
		}
		if (nums2.length == 0) {
			return calculateMedian(nums1);
		}
		if (nums1.length == 0) {
			return calculateMedian(nums2);
		}
		int[] merged = new int[nums1.length + nums2.length];
		int a = 0, b = 0;
		for (int i = 0; i < merged.length; i++) {
			if (a < nums1.length && b == nums2.length) {
				merged[i] = nums1[a++];
			} else if (a == nums1.length && b < nums2.length) {
				merged[i] = nums2[b++];
			} else if (nums1[a] < nums2[b]) {
				merged[i] = nums1[a++];
			} else {
				merged[i] = nums2[b++];
			}
		}
        return calculateMedian(merged);
    }
	
	public static double calculateMedian(int[] array) {
		int l = array.length;
		int h = l / 2;
		if (l % 2 == 0) {
			double median = (array[h - 1] + array[h]) / 2.0;
			return median;
		}
		return array[(int)h];
	}
}

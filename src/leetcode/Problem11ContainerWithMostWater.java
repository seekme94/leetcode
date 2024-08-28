/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem11ContainerWithMostWater {

	/**
	 * Given an integer array height of length n. There are n vertical lines drawn such that the two end points of the i-th line are (i, 0) and (i, height[i]). 
	 * Find two lines that together with the x-axis form a container, such that the container contains the most water. 
	 * Return the maximum amount of water a container can store. Notice that you may not slant the container.
	 * <img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg" alt="Example for Problem 11" />
	 * 
	 * @param heights
	 * @return
	 */
	public static int maxArea(int[] heights) {
		// In mathematical terms, you are given an array which represents points on a graph.
		// Pick a point 'p' and try to form a rectangle with all other points. A rectangle can only be formed with another point of at least the height of 'p'.
		// Find out the area of this rectangle. The goal is to find a pair of points which make a rectangle of maximum area.
		int maxArea = 0;
		if (heights == null || heights.length < 2) {
			return 0;
		}
		for (int i = 0, j = heights.length - 1; i < j;) {
			int area = calculateArea(i, j, heights[i], heights[j]);
			if (area > maxArea) {
				maxArea = area;
			}
			if (heights[i] < heights[j]) {
				i++;
			} else {
				j--;
			}
		}
        return maxArea;
    }
	
	/**
	 * Given 4 points on x and y axes, finds out the width and height and returns the area
	 * 
	 * @param bl
	 * @param br
	 * @param tl
	 * @param tr
	 */
	public static int calculateArea(int bl, int br, int tl, int tr) {
		// Width is the difference between bottom-right and bottom-left points
		int width = br - bl;
		// Height is calculated from the smaller point of top-left and top-right
		int height = tl < tr ? tl : tr;
		return width * height;
	}
}

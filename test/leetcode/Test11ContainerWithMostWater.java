/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test11ContainerWithMostWater {

	@Test
	void testMaxArea() {
		assertEquals(0, Problem11ContainerWithMostWater.maxArea(null));
		assertEquals(0, Problem11ContainerWithMostWater.maxArea(new int[] {}));
		assertEquals(0, Problem11ContainerWithMostWater.maxArea(new int[] {5}));
		assertEquals(1, Problem11ContainerWithMostWater.maxArea(new int[] {1, 1}));
		assertEquals(8, Problem11ContainerWithMostWater.maxArea(new int[] {1, 2, 4, 4, 4}));
		assertEquals(49, Problem11ContainerWithMostWater.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
	}
}

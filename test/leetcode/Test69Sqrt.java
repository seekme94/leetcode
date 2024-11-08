/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test69Sqrt {

	@Test
	void testPerfectSquareRoot() {
		int[] numbers = {4, 9, 16, 25, 36, 49, 64, 81, 100};
		int[] sqrts = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < numbers.length; i++) {
			assertEquals(sqrts[i], Problem69Sqrt.mySqrt(numbers[i]));			
		}
	}

	@Test
	void testApproximateSquareRoot() {
		assertEquals(20, Problem69Sqrt.mySqrt(440));
		assertEquals(46339, Problem69Sqrt.mySqrt(2147395599));
		
	}

}

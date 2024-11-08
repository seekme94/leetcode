/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test70ClimbingStairs {

	@Test
	void testBaseCases() {
		assertEquals(1, Problem70ClimbingStairs.climbStairs(1));
		assertEquals(2, Problem70ClimbingStairs.climbStairs(2));
		assertEquals(3, Problem70ClimbingStairs.climbStairs(3));		
	}

	@Test
	void testComplex() {
		assertEquals(5, Problem70ClimbingStairs.climbStairs(4));
		assertEquals(8, Problem70ClimbingStairs.climbStairs(5));
		assertEquals(165580141, Problem70ClimbingStairs.climbStairs(40));		
	}

}

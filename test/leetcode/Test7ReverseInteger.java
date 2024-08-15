/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test7ReverseInteger {

	/**
	 * Test method for {@link leetcode.Problem7ReverseInteger#reverse(int)}.
	 */
	@Test
	void testReverse() {
		assertEquals(0, Problem7ReverseInteger.reverse(0));
		assertEquals(-1, Problem7ReverseInteger.reverse(-1));
		assertEquals(21, Problem7ReverseInteger.reverse(120));
		assertEquals(4201, Problem7ReverseInteger.reverse(1024));
		assertEquals(5, Problem7ReverseInteger.reverse(5000));
		assertEquals(9, Problem7ReverseInteger.reverse(900));
		assertEquals(0, Problem7ReverseInteger.reverse(1534236469));
		assertEquals(0, Problem7ReverseInteger.reverse(-2147483419));
	}
}

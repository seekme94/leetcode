/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem7ReverseInteger {
	
	/**
	 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
	 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
	 * 
	 * @param x
	 * @return
	 */
	public static int reverse(int x) {
		// Range check
		if (checkOverflow(x)) {
			return 0;
		}
		long y = 0;
		boolean negative = x < 0;
		if (negative) {
			x *= -1;
		}
		while (x > 0) {
			y = y * 10 + x % 10;
			x = x / 10;
		}
		if (negative) {
			y *= -1;
		}
		if (checkOverflow(y)) {
			return 0;
		}
		return (int)y;
    }

	public static boolean checkOverflow(long num) {		
		int min = (int)Math.pow(2, 31) * -1;
		int max = (int)Math.pow(2, 31) - 1;
		return num >= max || num <= min;
	}
}

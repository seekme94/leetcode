/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem69Sqrt {

	/**
	 * Given a non-negative integer x, return the square root of x rounded down to
	 * the nearest integer. The returned integer should be non-negative as well. You
	 * must not use any built-in exponent function or operator.
	 * 
	 * @param x
	 * @return
	 */
	public static int mySqrt(int x) {
		if (x <= 1) {
			return x;
		}
		double sqrt = x / 2; // Initial guess
		while (true) {
			double approximation = (sqrt + (x / sqrt)) / 2;
			// If the difference is very minor, then return right away
			if (Math.abs(sqrt - approximation) < 0.01) {
				return (int)approximation;
			}
			sqrt = approximation;
		}
	}
}

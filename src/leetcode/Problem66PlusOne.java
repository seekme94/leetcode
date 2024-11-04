/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem66PlusOne {

	/**
	 * You are given a large integer represented as an integer array digits, where each digits[i] is the i-th digit of the integer. 
	 * The digits are ordered from most significant to least significant in left-to-right order. 
	 * The large integer does not contain any leading 0's. 
	 * Increment the large integer by one and return the resulting array of digits.
	 * 
	 * @param digits
	 * @return
	 */
	public static int[] plusOne(int[] digits) {
		if (digits.length == 0) {
			return digits;
		}
		int i = digits.length - 1;
		boolean extend = false;
		while (i >= 0) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;
				if (i == 0) {
					extend = true;
					break;					
				}
			}
			i--;
		}
		if (extend) {
			int[] extended = new int[digits.length + 1];
			i = 0;
			extended[0] = 1;
			for (; i < digits.length; i++) {
				extended[i + 1] = digits[i];
			}
			return extended;
		}
        return digits;
    }
}

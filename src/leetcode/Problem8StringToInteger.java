/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem8StringToInteger {

	/**
	 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer. The algorithm for myAtoi(string s) is as follows:
		Whitespace: Ignore any leading whitespace (" ").
		Sign: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
		Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
		Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
		Return the integer as the final result.
	 * @param s
	 * @return
	 * @throws Exception 
	 */
	public static int myAtoi(String s) {
		s = s.trim();
		if (s.length() == 0) {
			return 0;
		}
		int num = 0;
		int i = 0; 
		boolean negative = false;
		// Handle sign, skip first character in case of a sign
		if (s.charAt(0) == '-') {
			negative = true;
			i++;
		} else if (s.charAt(0) == '+') {
			i++;
		}
		// Remove leading zeros
		for (; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '0' && num == 0) {
				continue;
			}
			// Only entertain digits
			if ((int)ch >= 48 && (int)ch <= 57) {
				int digit = (ch - 48);
				int check = num * 10 + digit;
				if (num > (Integer.MAX_VALUE - digit) / 10) {
					return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
				}
				num = (int)check;
			} else {
				break;
			}
		}
        return negative ? (num * -1) : num;
    }
	
	public static void main(String[] args) {
		myAtoi("02311");
	}
}

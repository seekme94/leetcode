/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem67AddBinary {

	/**
	 * Given two binary strings a and b, return their sum as a binary string.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static String addBinary(String a, String b) {
		// Add leading 0's if one is smaller than other
		while (a.length() < b.length()) {
			a = '0' + a;
		}
		while (b.length() < a.length()) {
			b = '0' + b;
		}
		boolean[] bin1 = new boolean[a.length()];
		boolean[] bin2 = new boolean[b.length()];
		for (int i = 0; i < bin1.length; i++) {
			bin1[i] = a.charAt(i) == '1';
			bin2[i] = b.charAt(i) == '1';
		}
		StringBuilder sb = new StringBuilder();
		boolean carry = false;
		for (int i = bin1.length - 1; i >= 0; i--) {
			// If there's a 1 carried forward, see if it can be utilized
			if (carry) {
				if (!bin1[i] && !bin2[i]) {
					sb.append("1");
					carry = false;
				} else if (bin1[i] != bin2[i]) {
					sb.append("0");
				} else {
					sb.append("1");
				}
			}
			else {
				if (!bin1[i] && !bin2[i]) {
					sb.append("0");
				} else if (bin1[i] != bin2[i]) {
					sb.append("1");
				} else {
					sb.append("0");
					carry = true;
				}				
			}
		}
		if (carry) {
			sb.append("1");
		}
        return sb.reverse().toString();
    }
}

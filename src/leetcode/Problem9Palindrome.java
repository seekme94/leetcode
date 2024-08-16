/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem9Palindrome {

	/**
	 * Given an integer x, return true if x is a palindrome, and false otherwise.
	 * E.g. 121 is a palindrome; -121 is not
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		return isPalindrome(s);
	}
	
	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

}

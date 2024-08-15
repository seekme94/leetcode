/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem5LongestPalindrome {
	/**
	 * Given a string s, return the longest Palindrome substring in s.
	 * 
	 * @param s
	 * @return
	 */
	public static String longestPalindrome(String s) {
		String longest = longestUsingLoops(s);
		System.out.println(s + "; " + longest);
		return longest;
	}
	
	public static String longest(String s) {
		if (s.length() < 2) {
			return s;
		}
		if (isPalindrome(s)) {
			return s;
		}
		String left = longest(s.substring(1));
		String right = longest(s.substring(0, s.length() - 1));
		return left.length() > right.length() ? left : right;
	}
	
	public static String longestUsingLoops(String s) {
		if (s.length() < 2) {
			return s;
		}
		String longest = "";
		// Outer loop is to determine the length of Palindrome
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				String sub = s.substring(j, i);
				if (isPalindrome(sub)) {
					if (sub.length() >= longest.length()) {
						longest = sub;
					}
				}
			}
		}
		return longest;
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

/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem58LengthOfLastWord {

	/**
	 * Given a string s consisting of words and spaces, return the length of the last word in the string.
	 * A word is a maximal substring consisting of non-space characters only.
	 * 
	 * Example:
	 * Input: s = "Hello World"
	 * Output: 5
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLastWord(String s) {
		if (s == null || "".equals(s)) {
			return -1;
		}
		int length = 0;
		int i = s.length() - 1;
		// Traverse trailing whitespaces
		while (i >= 0 && s.charAt(i) == (int) ' ') {
			i--;
		}
		// This is where the string begins
		while (i >= 0 && s.charAt(i) != (int) ' ') {
			i--;
			length++;
		}
		return length;
    }
}

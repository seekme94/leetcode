/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem20ValidParentheses {

	/**
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	 * An input string is valid if:
	 * 1. Open brackets must be closed by the same type of brackets.
	 * 2. Open brackets must be closed in the correct order.
	 * 3. Every close bracket has a corresponding open bracket of the same type.
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		char[] arr = new char[s.length()];
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// Return false if the character isn't a valid bracket
			if (!isBracketChar(ch)) {
				return false;
			}
			// At any point, if the array size exceeds the remaining characters, then return false
			if (j > s.length() - i) {
				return false;
			}
			// Entering a closing bracket into empty array is also false
			if (j == 0 && (ch == ')' || ch == '}' || ch == ']')) {
				return false;
			}
			// If starting char, then push into array
			if (ch == ')' && arr[j - 1] == '(') {
				j--;
			} else if (ch == '}' && arr[j - 1] == '{') {
				j--;
			} else if (ch == ']' && arr[j - 1] == '[') {
				j--;
			} else {
				arr[j++] = ch;
			}
		}
        return j == 0;
    }
	
	private static boolean isBracketChar(char ch) {
		return ch == '(' || ch == '{' || ch == '[' || ch == ')' || ch == '}' || ch == ']';
	}
}

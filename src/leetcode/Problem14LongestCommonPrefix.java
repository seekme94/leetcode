/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem14LongestCommonPrefix {
	
	/**
	 * Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
	 * 
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String smallest = strs[0];
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < smallest.length()) {
				smallest = strs[i];
			}
		}
		// If every character of the smallest string matches with every other string, then the smallest string is returned. 
		// Otherwise return the substring where a mismatch was found.
		StringBuilder sb = new StringBuilder();
		int currentIndex = 0;
		for (int i = 0; i < smallest.length(); i++ ) {
			// Match the character at currentIndex of all strings
			char ch = smallest.charAt(currentIndex);
			for(String s : strs) {
				if (s.charAt(currentIndex) != ch) {
					return sb.toString();
				}
			}
			// Append to the string builder
			sb.append(smallest.charAt(currentIndex));
			currentIndex++;
		}
		return sb.toString();
    }
	
	public static int getPrefixMatchingLength(String s1, String s2) {
		if (s1.equals(s2)) {
			return s1.length();
		}
		int l = 0;
		int limit = s1.length() < s2.length() ? s1.length() : s2.length();
		for (int i = 0; i < limit; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				l++;
			} else {
				break;
			}
		}
		return l;
	}
}

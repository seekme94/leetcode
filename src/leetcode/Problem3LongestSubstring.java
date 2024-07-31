/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem3LongestSubstring {
	/**
	 * Given a string s, find the length of the longest substring without repeating characters
	 * 
	 * @param s
	 * @return
	 */
    public static int lengthOfLongestSubstring(String s) {
        String candidate = "";
        String longest = "";
        for (int i = 0; i < s.length();) {
            if (!exists(candidate, s.charAt(i))) {
                candidate += s.charAt(i);
                i++;
            } else {
                if (candidate.length() > longest.length()) {
                    longest = candidate;
                }
                i = i - (candidate.length() - 1);
                candidate = "";
            }
        }
        return candidate.length() > longest.length() ? candidate.length() : longest.length();
    }

    public static boolean exists(String s, char c) {
        return s.indexOf(c) >= 0;
    }
}

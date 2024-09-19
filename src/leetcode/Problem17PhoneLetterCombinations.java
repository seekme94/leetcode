/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem17PhoneLetterCombinations {
	
	static int[] digits = new int[] {2, 3, 4, 5, 6, 7, 8, 9};
	static char[][] charset = new char[][] {
	    {'a', 'b', 'c'},
	    {'d', 'e', 'f'},
	    {'g', 'h', 'i'},
	    {'j', 'k', 'l'},
	    {'m', 'n', 'o'},
	    {'p', 'q', 'r', 's'},
	    {'t', 'u', 'v'},
	    {'w', 'x', 'y', 'z'}
	};

	/**
	 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
	 * Return the answer in any order. A mapping of digits to letters (just like on the telephone buttons). Note that 1 does not map to any letters.
	 * Example 1:
	 * Input: digits = "23"
	 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
	 * 
	 * @param digits
	 * @return
	 */
	public static java.util.List<String> letterCombinations(String digits) {
		java.util.List<String> list = new java.util.ArrayList<String>();
		if ("".equals(digits)) {
			return list;
		}
		list.add("");	// Something has to be there as root node
		for (char ch : digits.toCharArray()) {
			int digit = (int)ch - 48;	// Extract from ASCII
			char[] chars = charset[digit - 2];
			// Combine the chars with each existing string in the list
			for (String s : list.toArray(new String[] {})) {
				for (char c : chars) {
					list.add(s + String.valueOf(c));
				}
			}
		}
		java.util.List<String> cleanList = new java.util.ArrayList<String>();
		for (String s : list) {
			if (s.length() == digits.length()) {
				cleanList.add(s);
			}
		}
        return cleanList;
    }
}

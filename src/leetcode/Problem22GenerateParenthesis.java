/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class Problem22GenerateParenthesis {

	/**
	 * Given n pairs of parentheses, write a function to generate all combinations
	 * of well-formed parentheses. E.g.: Input: n = 3 Output:
	 * ["((()))","(()())","(())()","()(())","()()()"] Input: n = 1 Output: ["()"]
	 * 
	 * @param n
	 * @return
	 */
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		if (n > 0 && n <= 8) {
			permuteFast("", 0, 0, n, list);
//			Pretty darn slow
//			StringBuilder sb = new StringBuilder();
//			for (int i = 0; i < n; i++) {
//				sb.append("()");
//			}
//			String s = sb.toString();
//			permute(s, 0, s.length() - 1);
		}
		return list;
	}

	// Comment! Works but very slow
	public static void permute(String s, int i, int j, List<String> list) {
		if (i == s.length() || j == 0) {
			return;
		}
		if (isValid(s)) {
			list.add(s);
		}
		// Swap first char
		StringBuilder sb = new StringBuilder(s);
		char ch = s.charAt(0);
		sb.setCharAt(0, s.charAt(i));
		sb.setCharAt(i, ch);
		permute(sb.toString(), i + 1, s.length() - 1, list);

		// Swap last
		sb = new StringBuilder(s);
		ch = s.charAt(s.length() - 1);
		sb.setCharAt(s.length() - 1, s.charAt(j));
		sb.setCharAt(j, ch);
		permute(sb.toString(), i, j - 1, list);
	}

	public static void permuteFast(String current, int i, int j, int n, List<String> list) {
		if (current.length() == n * 2) {
			list.add(current);
			return;
		}
		if (i < n) {
			permuteFast(current + "(", i + 1, j, n, list);
		}
		if (j < i) {
			permuteFast(current + ")", i, j + 1, n, list);
		}
	}

	private static boolean isValid(String s) {
		int open = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				open++;
			} else {
				open--;
			}
			if (open < 0) {
				return false;
			}
		}
		return open == 0;
	}

	public static void main(String[] args) {
		long start = new Date().getTime();
		List<String> list = generateParenthesis(8);
		int i = 1;
		for (String str : list) {
//			System.out.println(i++ + ": " + str);
		}
		System.out.println(new Date().getTime() - start);
	}
}

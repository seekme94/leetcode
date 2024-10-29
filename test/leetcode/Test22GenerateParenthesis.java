/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test22GenerateParenthesis {

	@Test
	void testEmpty() {
		assertEquals(0, Problem22GenerateParenthesis.generateParenthesis(0).size());
	}

	@Test
	void testOne() {
		assertEquals("()", Problem22GenerateParenthesis.generateParenthesis(1).get(0));
	}

	@Test
	void testTwo() {
		String[] expected = { "()()", "(())" };
		List<String> list = Problem22GenerateParenthesis.generateParenthesis(2);
		for (String e : expected) {
			assertTrue(list.contains(e));
		}
	}

	@Test
	void testThree() {
		String[] expected = { "((()))", "(()())", "(())()", "()(())", "()()()" };
		List<String> list = Problem22GenerateParenthesis.generateParenthesis(3);
		for (String e : expected) {
			assertTrue(list.contains(e));
		}
	}

	@Test
	void testFour() {
		String[] expected = { "(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()",
				"(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()" };
		List<String> list = Problem22GenerateParenthesis.generateParenthesis(4);
		System.out.println(list.size());
		for (String e : expected) {
			System.out.println("Checking:" + e);
			assertTrue(list.contains(e));
		}
	}
}

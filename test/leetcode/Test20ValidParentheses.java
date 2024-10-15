/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * 
 */
public class Test20ValidParentheses {
	
	@Test
	void testEmpty() {
		assertTrue(Problem20ValidParentheses.isValid(""));
	}
	
	@Test
	void testInvalidCharacters() {
		assertFalse(Problem20ValidParentheses.isValid("(a)"));
	}

	@Test
	void testValidParenthesis() {
		assertTrue(Problem20ValidParentheses.isValid("()"));
		assertTrue(Problem20ValidParentheses.isValid("[[[]]]"));
		assertTrue(Problem20ValidParentheses.isValid("[()]"));
		assertTrue(Problem20ValidParentheses.isValid("[{()}]"));
		assertTrue(Problem20ValidParentheses.isValid("[]{}"));
		assertTrue(Problem20ValidParentheses.isValid("[{()}()]{}"));
	}

	@Test
	void testInvalidParenthesis() {
		assertFalse(Problem20ValidParentheses.isValid("}"));
		assertFalse(Problem20ValidParentheses.isValid("(})"));
		assertFalse(Problem20ValidParentheses.isValid("[("));
		assertFalse(Problem20ValidParentheses.isValid("]})({["));
		assertFalse(Problem20ValidParentheses.isValid("[{()]"));
		assertFalse(Problem20ValidParentheses.isValid("[{(})]"));
	}
}

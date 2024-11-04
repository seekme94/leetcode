/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test58LengthOfLastWord {

	@Test
	void testEmpty() {
		assertEquals(-1, Problem58LengthOfLastWord.lengthOfLastWord(null));
		assertEquals(-1, Problem58LengthOfLastWord.lengthOfLastWord(""));
	}

	@Test
	void testAllSpaces() {
		assertEquals(0, Problem58LengthOfLastWord.lengthOfLastWord("    "));
	}

	@Test
	void testSingle() {
		assertEquals(1, Problem58LengthOfLastWord.lengthOfLastWord("a"));
		assertEquals(1, Problem58LengthOfLastWord.lengthOfLastWord("a "));
		assertEquals(1, Problem58LengthOfLastWord.lengthOfLastWord(" a"));
		assertEquals(1, Problem58LengthOfLastWord.lengthOfLastWord(" a "));
		assertEquals(1, Problem58LengthOfLastWord.lengthOfLastWord("  a  "));
	}

	@Test
	void testWord() {
		assertEquals(5, Problem58LengthOfLastWord.lengthOfLastWord("alpha"));
		assertEquals(5, Problem58LengthOfLastWord.lengthOfLastWord("alpha "));
		assertEquals(5, Problem58LengthOfLastWord.lengthOfLastWord(" alpha"));
	}

	@Test
	void testMultiple() {
		assertEquals(7, Problem58LengthOfLastWord.lengthOfLastWord("alpha beta epsilon"));
		assertEquals(5, Problem58LengthOfLastWord.lengthOfLastWord("alpha alpha alpha"));
		assertEquals(4, Problem58LengthOfLastWord.lengthOfLastWord(" alpha  beta  gamma  delta  epsilon  zeta"));
	}
}

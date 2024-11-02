/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * 
 */
class Test28FindIndexOfFirstOccurrence {
	
	@Test
	final void testInvalidInputs() {
		assertEquals(-1, Problem28FindIndexOfFirstOccurrence.strStr(null, null));
		assertEquals(-1, Problem28FindIndexOfFirstOccurrence.strStr("", ""));
		assertEquals(-1, Problem28FindIndexOfFirstOccurrence.strStr("alpha", null));
		assertEquals(-1, Problem28FindIndexOfFirstOccurrence.strStr(null, "beta"));
		assertEquals(-1, Problem28FindIndexOfFirstOccurrence.strStr("small", "largerthansmall"));
	}
	
	@Test
	final void testSame() {
		assertEquals(0, Problem28FindIndexOfFirstOccurrence.strStr("same", "same"));
	}
	
	@Test
	final void testFirst() {
		assertEquals(0, Problem28FindIndexOfFirstOccurrence.strStr("mississippi", "miss"));
	}

	@Test
	final void testLast() {
		assertEquals(9, Problem28FindIndexOfFirstOccurrence.strStr("mississippi", "pi"));
	}

	@Test
	final void testMultiple() {
		assertEquals(2, Problem28FindIndexOfFirstOccurrence.strStr("mississippi", "ss"));
	}

	@Test
	final void testNotMatching() {
		assertEquals(-1, Problem28FindIndexOfFirstOccurrence.strStr("issippi", "issipi"));
	}
}

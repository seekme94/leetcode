/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test14LongestCommonPrefix {

	@Test
	void testLongestCommonPrefix() {
		String[] strs = {};
		assertEquals("", Problem14LongestCommonPrefix.longestCommonPrefix(strs));
		assertEquals("skadoosh", Problem14LongestCommonPrefix.longestCommonPrefix(new String[] {"skadoosh", "skadoosh", "skadoosh"}));
		assertEquals("", Problem14LongestCommonPrefix.longestCommonPrefix(new String[] {"skadoosh", "kamehameha", "avadakedavra"}));
		assertEquals("s", Problem14LongestCommonPrefix.longestCommonPrefix(new String[] {"skadoosh", "sesame", "sactumsempra"}));
		assertEquals("wind", Problem14LongestCommonPrefix.longestCommonPrefix(new String[] {"winds", "windows", "windmill"}));
		assertEquals("buffalo", Problem14LongestCommonPrefix.longestCommonPrefix(new String[] {"buffalo", "buffalo", "buffalobuffalo", "buffalogirls"}));
	}
}

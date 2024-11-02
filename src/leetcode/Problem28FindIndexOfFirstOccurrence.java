/**
 * 
 */
package leetcode;


/**
 * 
 */
public class Problem28FindIndexOfFirstOccurrence {
	
	/**
	 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is present.
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public static int strStr(String haystack, String needle) {
        if (needle == null || haystack == null) {
            return -1;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == 0 || haystack.length() == 0) {
            return -1;
        }
        char[] hayArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int i = 0;
        while (i < hayArr.length) {
        	int j = 0;
        	boolean matched = true;
        	while (j < needleArr.length) {
        		if ((i + j) == hayArr.length) {
        			return -1;
        		}
            	if (needleArr[j] != hayArr[i + j]) {
            		matched = false;
            		break;
            	}
            	j++;
        	}
        	if (matched) {
        		return i;
        	}
        	i++;
        }
        return -1;
    }
}

/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem12IntegerToRoman {
	
	static char[] chars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
	static int[] vals = {1, 5, 10, 50, 100, 500, 1000};

	/** Given an integer, convert it to a Roman numeral.
		Symbol	Value
		I	1
		V	5
		X	10
		L	50
		C	100
		D	500
		M	1000
		Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. 
		Converting a decimal place value into a Roman numeral has the following rules:
		1. If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, 
		append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
		2. If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, 
		for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. 
		Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
		3. Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. 
		You cannot append 5 (V), 50 (L), or 500 (D) multiple times. 
		4. If you need to append a symbol 4 times, use the subtractive form.
	 */
	public static String intToRoman(int num) {
		StringBuilder roman = new StringBuilder();
		// Find the index in val which is greater than the number
		int j = vals.length - 1;
		for (; j > 0; j--) {
			if (num >= vals[j]) {
				break;
			}
		}
		System.out.println("Starting character is " + chars[j]);
		while (num > 0) {
			if (num >= vals[j]) {
				// Handle 4x and 9x exclusively
				String toStr = String.valueOf(num);
				char first = toStr.charAt(0);
				if (first != '4' && first != '9') {
					roman.append(chars[j]);
					num -= vals[j];					
				} else  {
					int length = toStr.length();
					if (num == 4) {
						roman.append("IV");
						num -= 4;
					} else if (num == 9) {
						roman.append("IX");
						num -= 9;
					} else if (length == 2) {
						if (first == '4') {
							roman.append("XL");
							num -= 40;
						} else if (first == '9') {
							roman.append("XC");
							num -= 90;
						}
					} else if (length == 3) {
						if (first == '4') {
							roman.append("CD");
							num -= 400;
						} else if (first == '9') {
							roman.append("CM");
							num -= 900;
						}
					}
				}
				System.out.println("The number is " + num + "; roman is " + roman.toString());
			} else {
				j--;
				System.out.println("Next character is " + chars[j]);
			}
		}
        return roman.toString();
    }
}

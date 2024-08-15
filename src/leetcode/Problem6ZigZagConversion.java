/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem6ZigZagConversion {

	/**
	 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
		P   A   H   N
		A P L S I I G
		Y   I   R
	 *	And then read line by line: "PAHNAPLSIIGYIR"
	 *	Write the code that will take a string and make this conversion given a number of rows
	 * @param s
	 * @param rows
	 * @return
	 */
	public static String convert(String s, int rows) {
		if (rows < 2) {
			return s;
		}
		// Initialize a 2D matrix
		// Zigs are vertical; Zags are diagonal. The number of columns required will be half of length (ceiling)
		int columms = s.length() % 2 == 0 ? s.length() / 2 : (s.length() + 1) / 2;
		char[][] matrix = new char[rows][columms];
		// In the loop, first, fill in Zig in a single column, then fill in Zags diagonally
		int i = 0;
		int column = 0;
		outerLoop:
		while (true) {
			// Zig is when is is divisible by rows. Otherwise Zag
			for (int row = 0; row < rows; row++) {
				char ch = s.charAt(i++);
				matrix[row][column] = ch;
				if (i == s.length()) {
					break outerLoop;
				}
			}
			column++;
			for (int row = rows - 2; row > 0; row--) {
				char ch = s.charAt(i++);
				matrix[row][column++] = ch;
				if (i == s.length()) {
					break outerLoop;
				}
			}
		}
		return matrixToString(matrix, false);
	}
	
	public static String matrixToString(char[][] matrix, boolean verbose) {
		StringBuilder asString = new StringBuilder();
		if (verbose) {
			System.out.println("Matrix is of size: " + matrix.length + "x" + matrix[0].length);
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					char ch = matrix[i][j];
					System.out.print(ch + "\t");
				}
				System.out.println();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				char ch = matrix[i][j];
				if ((int)ch >= 32) {
					asString.append(ch);
				}
				System.out.print(ch + "\t");
			}
			System.out.println();
		}
		return asString.toString();
	}

	public static void main(String[] args) {
		String s = convert("PAYPALISHIRING", 3);
		System.out.println(s);
		long from = System.currentTimeMillis();
		convert("ibgkxinzlgbjntwrvtlbmstfemisdnslpavokkovqphekfxiaijmaeugqcbtrvggvdxfnlcdajjnqgvqpedrizaabbtswbbteyatlcwnoiaeovvdbaxlzxlcygwwhzpnzpgkrfahnambyjhzlelkbwobfkxmkmcjbiwupwccwqguznwmrhyufmvkyszigbuhlsdbofdmxjjyyfkroiltuievcffigzrtrvuhcaucldakkldyvprszxnecsmkugendavhapjmukyexdcsutmutzyvumiosmbxmwfpnodhadnxgpsblevegvbahlqcxrzmqebfvgpvjcvpupqfvnlbiodsatuznvldcoixuxudcpvwelbcbodjejdecxgpttuviduecokeefaksdottsfabigfgmxbgryqusuziefojibcnpvjhcjklpstcpuiguydouewzjlkrmmhbkqlmzxzopssgmcnicswxwtwheibqvithyevzevptnicckpknjhmhakogspypzrwxyuycpoxewzgiqtxzcjgetxkmm", 343);
		long to = System.currentTimeMillis();
	    System.out.println("Elapsed time (milliseconds): " + (to - from));
	}
}

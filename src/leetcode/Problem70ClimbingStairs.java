/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem70ClimbingStairs {
	
	/**
	 * You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. 
	 * In how many distinct ways can you climb to the top?
	 * 
	 * @param n
	 * @return
	 */
    public static int climbStairs(int n) {
    	if (n <= 0 || n > 45) {
    		return 0;
    	}
    	if (n <= 3) {
    		return n;
    	}
    	int[] arr = new int[n + 1];
    	for (int i = 0; i <= 3; i++) {
    		arr[i] = i;
    	}
    	return climbStairsDynamic(n, arr);
    }
    
    public static int climbStairsDynamic(int n, int[] arr) {
    	if (arr[n] != 0) {
    		return arr[n];
    	}
		int a = climbStairsDynamic(n - 1, arr);
		int b = climbStairsDynamic(n - 2, arr);
		arr[n] = a + b;
		return a + b;
    }
}

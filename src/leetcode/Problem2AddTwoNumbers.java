/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem2AddTwoNumbers {
	/**
	 * You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
	 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
		String s1 = "", s2 = "";
        while (l1 != null) {
			s1 = String.valueOf(l1.val) + s1;
			l1 = l1.next;
		}
        while (l2 != null) {
			s2 = String.valueOf(l2.val) + s2;
			l2 = l2.next;
		}
		String sumStr = new java.math.BigInteger(s1).add(new java.math.BigInteger(s2)).toString(10);
		for(int i = sumStr.length() - 1; i > 0; i--) {
			int digit = sumStr.charAt(i) - '0';
            result.val = digit;
            result = result.next = new ListNode();
		}
        result.val = sumStr.charAt(0) - '0';
		return head;
    }
}

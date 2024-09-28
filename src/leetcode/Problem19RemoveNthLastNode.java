/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem19RemoveNthLastNode {
	
	/**
	 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
	 * Example:
	 * https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg
	 * Input: head = [1, 2, 3, 4, 5], n = 2
	 * Output: [1, 2, 3, 5]
	 * 
	 * Constraints:
	 * The number of nodes in the list is sz.
	 * 1 <= sz <= 30
	 * 0 <= Node.val <= 100
	 * 1 <= n <= sz
	 * 
	 * @param head
	 * @param n
	 * @return
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		// Handle validations
		if (n < 1 || head == null) {
			return head;
		}
		ListNode current = head;
		int count = sizeOf(head);
		if (n > count) {
			return head;
		}
		// If the first node is to be removed
		if (n == count) {
			return head.next;
		}
		// Otherwise keep proceeding till desired node is reached
		while (current != null) {
			if (count - 1 == n) {
				current.next = current.next.next;
				return head;
			}
			current = current.next;
			count--;
		}
        return head;
    }
	
	public static int sizeOf(ListNode head) {
		int size = 0;
		while (head != null) {
			size++;
			head = head.next;
		}
        return size;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		ListNode list = new ListNode(arr);
		list.print();
		list = removeNthFromEnd(list, 3);
		list.print();
		list = removeNthFromEnd(list, 4);
		list.print();
	}
}

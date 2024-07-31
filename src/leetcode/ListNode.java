package leetcode;

public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	ListNode(int[] arr) {
		val = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ListNode newNode = new ListNode(arr[i]);
			next = newNode;
		}
	}
}

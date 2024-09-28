package leetcode;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public ListNode(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        this.val = arr[0];
        ListNode current = this;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
    }

	public void print() {
		ListNode temp = this;
		while (temp != null) {
			System.out.print(temp.val + "; ");
			temp = temp.next;
		}
		System.out.println();
	}
}

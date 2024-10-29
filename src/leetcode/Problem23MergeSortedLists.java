/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem23MergeSortedLists {

	/**
	 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. 
	 * Merge all the linked-lists into one sorted linked-list and return it.
	 * 
	 * @param lists
	 * @return
	 */
	public static ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}
		if (lists.length == 1) {
			return lists[0];
		}
		if (lists.length == 2) {
			return mergeTwoLists(lists[0], lists[1]);
		}
		if (lists.length == 3) {
			return mergeTwoLists(mergeTwoLists(lists[0], lists[1]), lists[2]);
		}
		int mid = lists.length % 2 == 0 ? lists.length / 2 : (lists.length + 1) / 2;
		ListNode[] left = new ListNode[mid];
		for (int i = 0; i < mid; i++) {
			left[i] = lists[i];
		}
		ListNode[] right = new ListNode[lists.length - mid];
		for (int i = 0; i < lists.length - mid; i++) {
			right[i] = lists[mid + i];
		}
		return mergeKLists(new ListNode[] {mergeKLists(left), mergeKLists(right)});
	}
	
	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	if (list1 == null && list2 == null) {
    		return null;
    	}
    	if (list2 == null) {
    		return list1;
    	}
    	if (list1 == null) {
    		return list2;
    	}    	
    	ListNode head1 = list1;
    	ListNode head2 = list2;
    	ListNode merged = new ListNode();
    	ListNode mergedHead = merged;
    	
    	// If head1.next == null or head2.next == null, then break
    	while (true) {
    		if (head1 == null || head2 == null) {
    			break;
    		}
    		int lower = 0;
    		if (head1.val < head2.val) {
    			lower = head1.val;
    			head1 = head1.next;
    		} else {
    			lower = head2.val;
    			head2 = head2.next;
    		}
			merged.val = lower;
			merged = merged.next = new ListNode();
    	}
    	// Insert if remaining in head1
    	if (head1 != null) {    		
    		while (true) {
    			merged.val = head1.val;
    			head1 = head1.next;
    			if (head1 == null) {
    				break;
    			}
    			merged = merged.next = new ListNode();
    		}
    	}
    	// Insert if remaining in head2
    	if (head2 != null) {
    		while (true) {
    			merged.val = head2.val;
    			head2 = head2.next;
    			if (head2 == null) {
    				break;
    			}
    			merged = merged.next = new ListNode();
    		}
    	}
        return mergedHead;
    }
}

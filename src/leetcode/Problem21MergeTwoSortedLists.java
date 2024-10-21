/**
 * 
 */
package leetcode;

/**
 * 
 */
public class Problem21MergeTwoSortedLists {

	/**
	 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists. 
	 * Return the head of the merged linked list.
	 * 
	 * Constraints:
	 * The number of nodes in both lists is in the range [0, 50].
	 * -100 <= Node.val <= 100
	 * Both list1 and list2 are sorted in non-decreasing order.
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
    	while(head1 != null && head2 != null) {
    		int lower = 0;
    		if (head1.val < head2.val) {
    			lower = head1.val;
    			head1 = head1.next;
    		} else {
    			lower = head2.val;
    			head2 = head2.next;
    		}
			merged.val = lower;
			merged.next = new ListNode();
			merged = merged.next;
    	}
    	// Insert if remaining in head1
    	while (head1 != null) {
			merged.val = head1.val;
			merged.next = new ListNode();
			merged = merged.next;
			head1 = head1.next;
    	}
    	// Insert if remaining in head2
    	while (head2 != null) {
			merged.val = head2.val;
			merged.next = new ListNode();
			merged = merged.next;
			head2 = head2.next;
    	}
        return mergedHead;
    }
}
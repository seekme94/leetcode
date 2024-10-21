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
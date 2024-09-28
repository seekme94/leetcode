/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class Test19RemoveNthLastNode {

	@Test
	void testOutOfRange() {
		ListNode list = new ListNode(new int[] {-1});
		ListNode newList = Problem19RemoveNthLastNode.removeNthFromEnd(list, 0);
		assertEquals(-1, newList.val);
		
		list = new ListNode(new int[] {-1, 4, 8});
		newList = Problem19RemoveNthLastNode.removeNthFromEnd(list, 5);
		assertEquals(3, Problem19RemoveNthLastNode.sizeOf(newList));
	}

	@Test
	void testFirst() {
		ListNode list = new ListNode(new int[] {1, 2});
		ListNode newList = Problem19RemoveNthLastNode.removeNthFromEnd(list, 1);
		assertEquals(1, Problem19RemoveNthLastNode.sizeOf(newList));
	}

	@Test
	void testLast() {
		ListNode list = new ListNode(new int[] {1, 2, 3});
		ListNode newList = Problem19RemoveNthLastNode.removeNthFromEnd(list, 3);
		assertEquals(2, Problem19RemoveNthLastNode.sizeOf(newList));
	}
	
	@Test
	void testEmpty() {
		ListNode list = new ListNode(new int[] {0});
		ListNode newList = Problem19RemoveNthLastNode.removeNthFromEnd(list, 1);
		assertEquals(0, Problem19RemoveNthLastNode.sizeOf(newList));
	}
}

/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * 
 */
class Test23MergeKSortedLists {

	@Test
	void testNull() {
		assertNull(Problem23MergeSortedLists.mergeKLists(new ListNode[] {}));
	}

	@Test
	void testOne() {
		ListNode actual = Problem23MergeSortedLists.mergeKLists(new ListNode[] {new ListNode(new int[] {1})});
		assertNotNull(actual);
		int[] expected = {1};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
		assertNull(actual);
	}

	@Test
	void testMerge2Lists() {
		ListNode list1 = new ListNode(new int[] {1, 2, 4});
		ListNode list2 = new ListNode(new int[] {1, 3, 4});
		ListNode actual = Problem23MergeSortedLists.mergeKLists(new ListNode[] {list1, list2});
		assertNotNull(actual);
		int[] expected = {1, 1, 2, 3, 4, 4};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
		assertNull(actual);
	}

	@Test
	void testMergeEvenLists() {
		ListNode list1 = new ListNode(new int[] {1, 2, 4});
		ListNode list2 = new ListNode(new int[] {1, 3, 4});
		ListNode list3 = new ListNode(new int[] {5, 6, 7, 8, 9});
		ListNode list4 = new ListNode(new int[] {5, 6, 9, 10});
		ListNode actual = Problem23MergeSortedLists.mergeKLists(new ListNode[] {list1, list2, list3, list4});
		assertNotNull(actual);
		int[] expected = {1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9, 10};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
		assertNull(actual);
	}

	@Test
	void testMergeOddLists() {
		ListNode list1 = new ListNode(new int[] {1, 2, 4});
		ListNode list2 = new ListNode(new int[] {1, 3, 4});
		ListNode list3 = new ListNode(new int[] {5, 6, 7, 8, 9});
		ListNode list4 = new ListNode(new int[] {5, 6, 9, 10});
		ListNode list5 = new ListNode(new int[] {10, 11, 12});
		ListNode actual = Problem23MergeSortedLists.mergeKLists(new ListNode[] {list1, list2, list3, list4, list5});
		assertNotNull(actual);
		int[] expected = {1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9, 10, 10, 11, 12};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
		assertNull(actual);
	}
}

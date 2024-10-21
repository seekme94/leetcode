/**
 * 
 */
package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * 
 */
class Test21MergeTwoSortedLists {
	
	@Test
	void testNull() {
		assertNull(Problem21MergeTwoSortedLists.mergeTwoLists(null, null));
	}

	@Test
	void testOneNull() {
		ListNode list1 = new ListNode(new int[] {1, 2, 3});
		ListNode actual = Problem21MergeTwoSortedLists.mergeTwoLists(list1, null);
		assertNotNull(actual);
		assertEquals(list1, actual);
		ListNode list2 = new ListNode(new int[] {7, 8, 9});
		ListNode actual2 = Problem21MergeTwoSortedLists.mergeTwoLists(null, list2);
		assertNotNull(actual2);
		assertEquals(list2, actual2);
	}

	@Test
	void testOneAfterAnother() {
		ListNode list1 = new ListNode(new int[] {1, 2, 3});
		ListNode list2 = new ListNode(new int[] {7, 8, 9});
		ListNode actual = Problem21MergeTwoSortedLists.mergeTwoLists(list1, list2);
		assertNotNull(actual);
		int[] expected = {1, 2, 3, 7, 8, 9};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
	}

	@Test
	void testSame() {
		ListNode list1 = new ListNode(new int[] {1, 2});
		ListNode list2 = new ListNode(new int[] {1, 2});
		ListNode actual = Problem21MergeTwoSortedLists.mergeTwoLists(list1, list2);
		assertNotNull(actual);
		int[] expected = {1, 1, 2, 2};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
	}

	@Test
	void testMixedValues() {
		ListNode list1 = new ListNode(new int[] {1, 3, 5});
		ListNode list2 = new ListNode(new int[] {2, 4, 6});
		ListNode actual = Problem21MergeTwoSortedLists.mergeTwoLists(list1, list2);
		assertNotNull(actual);
		int[] expected = {1, 2, 3, 4, 5, 6};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
	}


	@Test
	void testUnevenSizes() {
		ListNode list1 = new ListNode(new int[] {1, 3, 5, 7});
		ListNode list2 = new ListNode(new int[] {8, 10});
		ListNode actual = Problem21MergeTwoSortedLists.mergeTwoLists(list1, list2);
		assertNotNull(actual);
		int[] expected = {1, 3, 5, 7, 8, 10};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
	}
	
	@Test
	void testListSize() {
		ListNode list1 = new ListNode(new int[] {1, 2, 4});
		ListNode list2 = new ListNode(new int[] {1, 3, 4});
		ListNode actual = Problem21MergeTwoSortedLists.mergeTwoLists(list1, list2);
		assertNotNull(actual);
		int[] expected = {1, 1, 2, 3, 4, 4};
		for (int num : expected) {
			assertEquals(num, actual.val);
			actual = actual.next;
		}
		assertNull(actual);
	}
}

package leetcode;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class Test2AddTwoNumbers {

	@Test
	@Ignore
	void testAddTwoNumbers() {
		ListNode l1 = new ListNode(new int[] {2, 4, 5});
		ListNode l2 = new ListNode(new int[] {1, 5});
		assertNotNull(Problem2AddTwoNumbers.addTwoNumbers(l1, l2));
	}

}

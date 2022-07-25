package leetcode;

// 21. Merge Two Sorted Lists
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. 
// The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

public class leetCode21 {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}

		ListNode firstNode = new ListNode(0);
		ListNode nextNode = firstNode;

		while (list1 != null && list2 != null) {
			if (list1.val > list2.val) {
				nextNode.next = list2;
				list2 = list2.next;
			} else {
				nextNode.next = list1;
				list1 = list1.next;
			}
			nextNode = nextNode.next;
		}

		if (list1 == null) {
			nextNode.next = list2;
		}
		if (list2 == null) {
			nextNode.next = list1;
		}

		return firstNode.next;
	}

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
	}
}

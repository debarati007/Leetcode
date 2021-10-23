package Misc.DSA;

import Misc.DSA.ListNode;

public class LinkedListPalindrome {
    //reach to mid using 2 pointers,reverse from mid and no second half head is at end so start comparing till mid.
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null || (head.next.next == null && head.val == head.next.val))
            return true;
        ListNode fast = head;
        ListNode slow = head;
        int count = 1;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        ListNode mid = slow;
        ListNode previous = slow;
        ListNode current = slow.next;
        ListNode nextP = null;
        while (current != null) {
            nextP = current.next;
            current.next = previous;
            previous = current;
            current = nextP;
        }
        current = previous;
        while (current != mid) {
            if (head.val != current.val)
                return false;
            head = head.next;
            current = current.next;

        }

        return true;
    }
}

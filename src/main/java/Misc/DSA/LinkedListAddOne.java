package Misc.DSA;

public class LinkedListAddOne {
    //123+1=124
    //reverse ll,create a ll with single node and value 1,add 2 ll, store result in new ll, reverse the result ll.
    public static ListNode addOne(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pp = null;
        ListNode cc = head;
        ListNode nn = null;
        while (cc != null) {
            nn = cc.next;
            cc.next = pp;
            pp = cc;
            cc = nn;
        }
        ListNode h = pp;
        ListNode newList = new ListNode(1);
        newList.next = null;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while (h != null || newList != null || carry == 1) {
            int sum = 0;
            if (h != null) {
                sum += h.val;
                h = h.next;
            }
            if (newList != null) {
                sum += newList.val;
                newList = newList.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode n = new ListNode(sum % 10);
            temp.next = n;
            temp = temp.next;
        }
        // Node h2=dummy.next;
        ListNode pp1 = null;
        ListNode cc1 = dummy.next;
        ListNode nn1 = null;
        while (cc1 != null) {
            nn1 = cc1.next;
            cc1.next = pp1;
            pp1 = cc1;
            cc1 = nn1;
        }
        return pp1;
    }
}

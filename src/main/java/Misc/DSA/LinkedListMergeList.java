package Misc.DSA;

public class LinkedListMergeList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode temp = node;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode newNode = new ListNode(l1.val);
                temp.next = newNode;
                l1 = l1.next;
            } else {
                ListNode newNode = new ListNode(l2.val);
                temp.next = newNode;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        while (l1 != null) {
            ListNode newNode = new ListNode(l1.val);
            temp.next = newNode;
            l1 = l1.next;
            temp = temp.next;

        }
        while (l2 != null) {
            ListNode newNode = new ListNode(l2.val);
            temp.next = newNode;
            l2 = l2.next;
            temp = temp.next;
        }

        return node.next;
    }
}

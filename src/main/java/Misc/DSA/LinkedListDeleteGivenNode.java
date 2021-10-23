package Misc.DSA;

public class LinkedListDeleteGivenNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
//The trick here is to copy data of next node to current node and then delete the next node
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

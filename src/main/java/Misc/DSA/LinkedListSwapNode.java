package Misc.DSA;

public class LinkedListSwapNode {
    //O(3) space.uses 3 pointers
    //O(n) tc.
    //temp pointing to head,head shifts to next,another temporary node holds address of 3rd node.
    //head points to temp now and for temp's next,recursively same fn is called on nextNode so swapping keeps happening.
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode temp=head;
        head=head.next;
        ListNode nextNode=head.next;
        head.next=temp;
        temp.next=swapPairs(nextNode);
        return head;
    }
}

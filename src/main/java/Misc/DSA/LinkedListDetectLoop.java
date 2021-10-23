package Misc.DSA;

public class LinkedListDetectLoop {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        if(head.next==head)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(fast.next==null || fast.next.next==null)
                return false;
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
    }
}

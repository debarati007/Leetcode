package Misc.DSA;

public class LinkedListReverse {

    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        //using 3 pointer
        //to reverse I need to cut the next link for each node and point in to previous node starting from head
        //before that I need to save the next node address in a pointer
        //then move prev pointer to current position and current to next position to continue
        //until current is null.
        ListNode current = head;
        ListNode previous = null;
        ListNode nextNode = null;
        while(current!=null){
            nextNode=current.next;
            current.next=previous;
            previous=current;
            current=nextNode;
        }
        return previous;
    }
}

package Misc.DSA;

public class LinkedListReverse {
//single list
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

    //double linked list
    //storing previous and next address of node in each node
    //we need to swap this prev and next in each node
    public ListNode reverseDoubleList(ListNode head) {
        if(head==null)
            return head;
        ListNode current = head;
        ListNode nextNode = null;
        while(current!=null){
            nextNode=current.next;
            current.next=current.prev;
            current.prev=nextNode;
            current=nextNode;
        }
        current=head;
        //head=tail
        return head;
    }


}

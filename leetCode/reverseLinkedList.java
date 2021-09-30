//Given the head of a singly linked list, reverse the list, and return the reversed list.
/**
 * class ListNode {
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
 * 
 */
public class reverseLinkedList{
    
     
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, nextTemp = null;

        while (curr != null) {
            nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

}

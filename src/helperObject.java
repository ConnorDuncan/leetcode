import java.util.*;
public class helperObject {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        ListNode tail = new ListNode(head.val);
        while(head.next != null){
            ListNode temp = new ListNode(head.next.val);
            temp.next = tail;
            tail = temp;
            head = head.next;
        }

        return tail;
    }
}


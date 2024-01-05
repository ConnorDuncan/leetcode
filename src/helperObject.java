import java.util.*;
public class helperObject {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        else if(head.next == null){
            if(head.val == val){
                return null;
            }
            return head;
        }
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode cur = head;
        while(cur != null && cur.next != null){
            while(cur.next != null && cur.next.val == val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }

}


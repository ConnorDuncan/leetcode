import java.util.*;
public class helperObject {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> myHash = new HashSet<Integer>();
        if(head == null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        myHash.add(head.val);
        while(cur.next != null){
            if(!myHash.contains(cur.val)){
                myHash.add(cur.val);
                prev = cur;
                cur = cur.next;
            }
            else{
                prev.next = cur.next;
                cur = prev.next;
            }
        }
        if(myHash.contains(cur.val)){
            prev.next = null;
        }
        return head;
/*
More efficient solution:
ListNode current = head;
while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next;
            }
}
return head;
 */

    }
}


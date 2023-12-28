import java.util.*;
public class helperObject {
    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head.next != null){
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);
        Collections.sort(list);
        ListNode cur = new ListNode();
        ListNode myHead = cur;
        for(int i = 0; i < list.size() - 1; i++){
            cur.val = list.get(i);
            cur.next = new ListNode();
            cur = cur.next;
        }
        cur.val = list.get(list.size() - 1);
        return myHead;
    }
}


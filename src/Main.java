import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        helperObject myDupeRemover = new helperObject();
        ListNode head = new ListNode();
        head.val = 1;
        ListNode cur = head;
        head.next = new ListNode(1);
        cur = head.next;
        cur.next = new ListNode(2);
        cur = cur.next;
        cur.next = new ListNode(2);
        cur = cur.next;

        cur.next = new ListNode(3);
        cur = cur.next;
        cur.next = new ListNode(3);
        head = myDupeRemover.deleteDuplicates(head);
        while(head.next != null){
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(head.val);

    }
}
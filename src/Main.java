import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        helperObject myobj = new helperObject();
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        next.next = new ListNode(3);
        next = next.next;
        ListNode result = myobj.reverseList(head);
        while(result.next != null){
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);
    }

}
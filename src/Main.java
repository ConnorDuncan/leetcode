import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        helperObject mySort = new helperObject();
        ListNode head = new ListNode();
        head.val = 4;
        head.next = new ListNode(3);
        ListNode output = mySort.sortList(head);
        System.out.println(output.val);
        System.out.println(output.next.val);

    }
}
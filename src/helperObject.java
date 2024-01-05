import java.util.*;
public class helperObject {
    public boolean isPalindrome(ListNode head) {
        StringBuilder builder = new StringBuilder();
        if(head == null){
            return true;
        }
        else if(head.next == null){
            return true;
        }
        while(head.next != null){
            builder.append(head.val);
            head = head.next;
        }
        builder.append(head.val);
        String s = builder.toString();
        int len = s.length();
        for(int i = 0; i < len / 2; i++){
            if(s.charAt(i) != s.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
    }

}


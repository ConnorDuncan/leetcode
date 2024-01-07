import java.util.*;
public class helperObject {
    public String reverseOnlyLetters(String s) {
        Stack<Character> myStack = new Stack<Character>();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
                myStack.push(c);
            }
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!(c >= 65 && c <= 90) && !(c >= 97 && c <= 122)){
                builder.append(c);
            }
            else{
                builder.append(myStack.pop());
            }
        }
        return builder.toString();

    }
}


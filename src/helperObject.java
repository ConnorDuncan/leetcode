import java.util.*;
public class helperObject {
    public boolean rotateString(String s, String goal) {
        int counter = 0;
        if(s.length() == 1){
            if (goal.equals(s)){
                return true;
            }
            return false;
        }
        else if(goal.equals(s)){
            return true;
        }
        while(counter < s.length()){
            if(goal.equals(s)){
                return true;
            }
            s = s.substring(1) + s.charAt(0);
            counter++;
        }
        return false;
    }
}


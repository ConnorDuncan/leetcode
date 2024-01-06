import java.util.*;
public class helperObject {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        boolean firstIsOne = false;
        if(s.charAt(0) == '1'){
            firstIsOne = true;
        }
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == '1' && firstIsOne){
                return false;
            }
            else if(s.charAt(i) == '0' && !firstIsOne){
                return false;
            }
            firstIsOne = !firstIsOne;
        }
        return true;
    }
}


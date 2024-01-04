import java.util.*;
public class helperObject {
    public String maximumOddBinaryNumber(String s) {
        int numBits = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '1'){
                numBits++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        for(int i = 0; i < s.length() - numBits; i++){
            sb.append('0');
        }
        for(int i = 1; i < numBits; i++){
            sb.append('1');
        }
        return sb.reverse().toString();
    }

}


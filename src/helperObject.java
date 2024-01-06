import java.util.*;
public class helperObject {
    public String toLowerCase(String s) {
        int len = s.length();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c += 32;
            }
            builder.append(c);
        }
        return builder.toString();
    }
}


import java.util.*;
public class helperObject {
    public String largestOddNumber(String num) {
        StringBuilder builder = new StringBuilder(num);
        num = builder.reverse().toString();
        boolean isOdd = false;
        int i = 0;
        builder = new StringBuilder();
        while (!isOdd && i < num.length()){
            char c = num.charAt(i);
            if((c - 48) % 2 == 1){
                isOdd = true;
                builder.append(c);
            }
            i++;
        }
        if(i < num.length()){
            builder.append(num.substring(i));
        }
        return builder.reverse().toString();
    }

}


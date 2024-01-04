import java.util.*;
public class helperObject {
    public String largestOddNumber(String num) {
        StringBuilder builder = new StringBuilder();
        boolean isOdd = false;
        for(int i = num.length() - 1; i > -1; i--){
            if(isOdd){
                builder.append(num.charAt(i));
            }
            else{
                if((num.charAt(i) - 48) % 2 == 1){
                    isOdd = true;
                    builder.append(num.charAt(i));
                }
            }
        }
        return builder.reverse().toString();
    }

}


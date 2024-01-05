import java.util.*;
public class helperObject {
    public int addDigits(int num) {
        String s = "" + num;
        int result = num;
        while(result > 9){
            result = 0;
            for(int i = 0; i < s.length(); i++){
                int temp = s.charAt(i) - 48;
                result += temp;
            }
            s = "" + result;
        }
        return result;
    }

}


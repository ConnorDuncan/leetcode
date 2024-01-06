import java.util.*;
public class helperObject {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> selfDividing = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            String s = "" + i;
            int len = s.length();
            boolean selfDividingB = true;
            for(int k = 0; k < len; k++){
                char c = s.charAt(k);
                int j = Integer.parseInt("" + c);
                if(j == 0 || i % j != 0){
                    selfDividingB = false;
                }
            }
            if(selfDividingB){
                selfDividing.add(i);
            }
        }
        return selfDividing;
    }
}


import java.util.*;
public class helperObject {
    public int hammingWeight(int n) {
        int sum = 0;
        String myString = Integer.toBinaryString(n);
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == '1'){
                sum++;
            }
        }
        return sum;
    }

}


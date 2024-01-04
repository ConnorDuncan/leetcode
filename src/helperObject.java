import java.util.*;
public class helperObject {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            String s = Integer.toBinaryString(i);
            int numBits = 0;
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(c == '1'){
                    numBits++;
                }
            }
            if(numBits == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }

}


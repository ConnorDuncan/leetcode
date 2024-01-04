import java.util.*;
public class helperObject {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i : nums){
            if(myMap.containsKey(i)){
                myMap.put(i, myMap.get(i) + 1);
            }
            else{
                myMap.put(i, 1);
            }

        }
        for(int i : myMap.keySet()){
            int val = myMap.get(i);
            if(val == 1){
                return -1;
            }
            while(val != 0){
                if(val % 3 == 0 || (val != 2 && val != 4)){
                    val -= 3;
                    count++;
                }
                else if(val % 2 == 0){
                    val -= 2;
                    count++;
                }
            }
        }
        return count;
    }
}


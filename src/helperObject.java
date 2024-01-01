import java.util.*;
public class helperObject {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!myMap.containsKey(nums[i])){
                myMap.put(nums[i], 1);
            }
            else{
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
            }
        }
        int max = 0;
        int val = 0;
        for(int i = 0; i < nums.length; i++){
            int tempVal = myMap.get(nums[i]);
            if(tempVal > max){
                max = tempVal;
                val = nums[i];
            }
        }
        return val;
    }
}


import java.util.*;
public class helperObject {
    // O(nlogn) solution
    /*
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    */

    // O(n) solution
    public int missingNumber(int[] nums) {
        int eSum = 0;
        int aSum = 0;
        for(int i = 0; i < nums.length; i++){
            eSum += i;
            aSum += nums[i];
        }
        eSum += nums.length;
        int diff = eSum - aSum;
        return diff;
    }
}


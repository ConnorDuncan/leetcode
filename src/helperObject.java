import java.util.*;
public class helperObject {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        if(nums.length == 1){
            return 0;
        }
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += nums[i];
            leftSum[i] = sum;
        }
        sum = 0;
        for(int i = len - 1; i > -1; i--){
            sum += nums[i];
            rightSum[i] = sum;
        }
        for(int i = 0; i < len; i++){
            if(rightSum[i] == leftSum[i]){
                return i;
            }
        }
        return -1;

    }
}


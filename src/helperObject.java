import java.util.*;
public class helperObject {
    public int singleNumber(int[] nums) {
        HashSet<Integer> numsRead = new HashSet<Integer>();
        HashSet<Integer> nonDupeNums = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!numsRead.contains(nums[i])){
                numsRead.add(nums[i]);
                nonDupeNums.add(nums[i]);
            }
            else{
                nonDupeNums.remove(nums[i]);
            }
        }
        for(int j : nonDupeNums){
            return j;
        }
        return -1;
    }
}


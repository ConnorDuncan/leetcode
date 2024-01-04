import java.util.*;
public class helperObject {
    public int minOperations(List<Integer> nums, int k) {
        ArrayList<Integer> numsAfter = new ArrayList<Integer>();
        int steps = 0;
        for(int i = nums.size() - 1; i > -1; i--){
            numsAfter.add(nums.get(i));
            steps++;
            boolean isDone = true;
            for(int j = 1; j <= k; j++){
                if(!numsAfter.contains(j)){
                    isDone = false;
                }
            }
            if(isDone){
                return steps;
            }
        }
        return -1;
    }

}


import java.util.*;
public class helperObject {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] returnarr = new int[len];
        for(int i = 0; i < len; i++){
            returnarr[i] = nums[i] * nums[i];
        }
        Arrays.sort(returnarr);
        return returnarr;
    }
}


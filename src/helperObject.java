import java.util.*;
public class helperObject {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<Integer>();
        for(int i : nums){
            if(!mySet.add(i)){
                return true;
            }
        }
        return false;
    }
}


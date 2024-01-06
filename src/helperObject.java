import java.util.*;
public class helperObject {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> mySet = new HashSet<Character>();
        int total = 0;
        for(int i = 0; i < jewels.length(); i++){
            mySet.add(jewels.charAt(i));
        }
        for(int i = 0; i < stones.length(); i++){
            if(mySet.contains(stones.charAt(i))){
                total++;
            }
        }
        return total;
    }
}


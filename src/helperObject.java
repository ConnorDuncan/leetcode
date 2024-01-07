import java.util.*;
public class helperObject {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        PriorityQueue<Integer> myQ = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i : stones){
            myQ.add(i);
        }
        int stoneOne = myQ.poll();
        int stoneTwo = myQ.poll();
        if(stoneOne != stoneTwo){
            if(stoneOne > stoneTwo){
                myQ.add(stoneOne - stoneTwo);
            }
            else{
                myQ.add(stoneTwo - stoneOne);
            }
        }
        while(myQ.size() >= 2){
            stoneOne = myQ.poll();
            stoneTwo = myQ.poll();
            if(stoneOne != stoneTwo){
                if(stoneOne > stoneTwo){
                    myQ.add(stoneOne - stoneTwo);
                }
                else{
                    myQ.add(stoneTwo - stoneOne);
                }
            }
        }
        if(myQ.size() == 0){
            return 0;
        }
        return myQ.poll();
    }
}


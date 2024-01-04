import java.util.*;
public class helperObject {
    public boolean isPathCrossing(String path) {
        HashSet<Pair> mySet = new HashSet<Pair>();
        Pair temp = new Pair(0, 0);
        mySet.add(temp);
        int curX = 0;
        int curY = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N'){
                curY++;
            }
            else if(path.charAt(i) == 'S'){
                curY--;
            }
            else if(path.charAt(i) == 'E'){
                curX++;
            }
            else if(path.charAt(i) == 'W'){
                curX--;
            }
            temp = new Pair(curX, curY);
            if(mySet.contains(temp)){
                return true;
            }
            else{
                mySet.add(temp);
            }
        }
        return false;
    }

}


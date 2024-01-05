import java.util.*;
public class helperObject {
    public boolean isIsomorphic(String s, String t) {
        int[] myMapOne = new int[128];
        int[] myMapTwo = new int[128];
        int length = s.length();
        for(int i = 0; i < length; i++){
            int sChar = (int)s.charAt(i);
            int tChar = (int)t.charAt(i);
            if(myMapOne[sChar] == 0 && myMapTwo[tChar] == 0){
                myMapOne[sChar] = tChar + 1;
                myMapTwo[tChar] = sChar + 1;
            }
            else{
                if(myMapOne[sChar] != (tChar + 1) || myMapTwo[tChar] != (sChar + 1)){
                    return false;
                }
            }
        }
        return true;
    }

}


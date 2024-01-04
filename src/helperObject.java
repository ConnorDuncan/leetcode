import java.util.*;
public class helperObject {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        for(String s : words){
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(myMap.containsKey(c)){
                    myMap.put(c, myMap.get(c) + 1);
                }
                else{
                    myMap.put(c, 1);
                }
            }
        }
        for(char c : myMap.keySet()){
            if(myMap.get(c) % words.length != 0){
                return false;
            }
        }
        return true;
    }
}


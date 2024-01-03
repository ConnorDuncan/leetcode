import java.util.*;
public class helperObject {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<Character, Integer>();
        Map<Character, Integer> mapT = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                if(mapS.containsKey(c)){
                    mapS.put(c, mapS.get(c) + 1);
                }
                else{
                    mapS.put(c, 1);
                }
            }

        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(c != ' '){
                if(mapT.containsKey(c)){
                    mapT.put(c, mapT.get(c) + 1);
                }
                else{
                    mapT.put(c, 1);
                }
            }

        }
        for(char c : mapS.keySet()){
            if(!mapT.containsKey(c)){
                return false;
            }
            else if(!mapT.get(c).equals(mapS.get(c))){
                return false;
            }
        }
        for(char c : mapT.keySet()){
            if(!mapS.containsKey(c)){
                return false;
            }
        }
        return true;
    }
}


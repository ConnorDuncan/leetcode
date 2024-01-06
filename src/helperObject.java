import java.util.*;
public class helperObject {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        int len1 = words1.length;
        int len2 = words2.length;
        for(int i = 0; i < len1; i++){
            if(myMap.containsKey(words1[i])){
                myMap.put(words1[i], myMap.get(words1[i]) + 1);
            }
            else{
                myMap.put(words1[i], 1);
            }
        }
        for(int i = 0; i < len2; i++){
            if(myMap.containsKey(words2[i])){
                myMap.put(words2[i], myMap.get(words2[i]) + 1);
            }
            else{
                myMap.put(words2[i], 1);
            }
        }
        ArrayList<String> myArrayList = new ArrayList<String>();
        for(String s : myMap.keySet()){
            if(myMap.get(s) == 1){
                myArrayList.add(s);
            }
        }
        String[] finalArr = new String[myArrayList.size()];
        int i = 0;
        for(String s : myArrayList){
            finalArr[i] = s;
            i++;
        }
        return finalArr;
    }
}


import java.util.*;
public class helperObject {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 97]++;
        }
        for(int i = 0; i < t.length(); i++){
            count[t.charAt(i) - 97]--;
        }
        for(int i = 0; i < 26; i++){
            if(count[i] == -1){
                return (char)(97 + i);
            }
        }
        return 'a';
    }
}


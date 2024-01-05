import java.util.*;
public class helperObject {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countOne = new int[26];
        int[] countTwo = new int[26];
        for(int i = 0; i < magazine.length(); i++){
            countOne[magazine.charAt(i) - 97]++;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            countTwo[ransomNote.charAt(i) - 97]++;
        }
        for(int i = 0; i < 26; i++){
            if(countTwo[i] > countOne[i]){
                return false;
            }
        }
        return true;
    }
}


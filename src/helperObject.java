import java.util.*;
public class helperObject {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        char[] letters = new char[26];
        int len = licensePlate.length();
        int shortestLen = 16;
        int shortestIndex = 0;
        for(int i = 0; i < len; i++){
            char c = licensePlate.charAt(i);
            if(c >= 'a' && c <= 'z'){
                letters[c - 97]++;
            }
            else if(c >= 'A' && c <= 'Z'){
                letters[c - 65]++;
            }
        }
        len = words.length;
        for(int i = 0; i < len; i++){ // for each word
            char[] lettersW = new char[26]; // make array to count characters
            for(int j = 0; j < words[i].length(); j++){ // for each character in word
                char c = words[i].charAt(j);
                if(c >= 'a' && c <= 'z'){
                    lettersW[c - 97]++;                 // count the character
                }
            }
            boolean valid = true;           // assume the word is valid
            for(int j = 0; j < 26; j++){    // for each character in alphabet
                if(letters[j] > lettersW[j]){   // if the license plate has more letters than letters in the word
                    valid = false;
                }
            }
            if(valid){
                int wLen = words[i].length();
                if(wLen < shortestLen){
                    shortestLen = wLen;
                    shortestIndex = i;
                }
            }
        }
        return words[shortestIndex];
    }
}


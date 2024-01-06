import java.util.*;
public class helperObject {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if(len == 1){
            return true;
        }
        boolean beginCapital = false;
        if(word.charAt(0) > 64 && word.charAt(0) < 91){ // uppercase
            beginCapital = true;
        }
        if(!beginCapital){
            for(int i = 1; i < len; i++){
                if(word.charAt(i) > 64 && word.charAt(i) < 91){
                    return false;
                }
            }
            return true;
        }
        else{
            boolean upper = false;
            if(word.charAt(1) > 64 && word.charAt(1) < 91){
                upper = true;
            }
            for(int i = 1; i < len; i++){
                char c = word.charAt(i);
                if(upper){
                    if(c > 96 && c < 123){
                        return false;
                    }
                }
                else{
                    if(c > 64 && c < 91){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}


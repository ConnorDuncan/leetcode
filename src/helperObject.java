import java.util.*;
public class helperObject {
    public int minOperations(String s) {
        int maxOne = 0;
        int maxTwo = 0;
        boolean alt = false;
        for(int i = 0; i < s.length(); i++){
            if(alt){
                if(s.charAt(i) != '0'){
                    maxOne++;
                }
            }
            else{
                if(s.charAt(i) != '1'){
                    maxOne++;
                }
            }
            alt = !alt;
        }
        alt = true;
        for(int i = 0; i < s.length(); i++){
            if(alt){
                if(s.charAt(i) != '0'){
                    maxTwo++;
                }
            }
            else{
                if(s.charAt(i) != '1'){
                    maxTwo++;
                }
            }
            alt = !alt;
        }
        if(maxOne > maxTwo){
            return maxTwo;
        }
        return maxOne;
    }

}


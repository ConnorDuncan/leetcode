import java.util.*;
public class helperObject {
    /* O(n^2) runtime
    public int maxScore(String s) {
        int maxScore = -1;
        int tempScore = 0;
        for(int i = 1; i < s.length(); i++){
            tempScore = 0;
            for(int j = 0; j < i; j++){
                if(s.charAt(j) == '0'){
                    tempScore++;
                }
            }
            for(int k = i; k < s.length(); k++){
                if(s.charAt(k) == '1'){
                    tempScore++;
                }
            }
            if (tempScore > maxScore){
                maxScore = tempScore;
            }
        }
        return maxScore;
    }
     */


    // O(n) runtime
    public int maxScore(String s) {
        int numOnes = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                numOnes++;
            }
        }
        int numZeros = 0;
        int ans = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '1'){
                numOnes--;
            }
            else{
                numZeros++;
            }
            if(numOnes + numZeros > ans){
                ans = numOnes + numZeros;
            }
        }
        return ans;
    }

}


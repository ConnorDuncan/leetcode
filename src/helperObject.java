import java.util.*;
public class helperObject {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n < 0 || n % 2 == 1){
            return false;
        }
        String binary = Integer.toBinaryString(n);
        boolean seenOne = false;
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                if(seenOne){
                    return false;
                }
                else{
                    seenOne = true;
                }
            }
        }
        return seenOne;
    }
}


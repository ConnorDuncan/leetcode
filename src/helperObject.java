import java.util.*;
public class helperObject {
    public int numberOfMatches(int n) {
        int matches = 0;
        while(n != 1){
            if(n % 2 == 1){
                matches += n / 2;
                n = (n / 2) + 1;
            }
            else{
                matches += n / 2;
                n /= 2;
            }
        }
        return matches;
    }

}

